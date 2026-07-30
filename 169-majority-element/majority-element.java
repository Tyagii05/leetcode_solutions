class Solution {
    public int majorityElement(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();
        int winningTarget = nums.length / 2;
        
        
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            map.put(currentNumber, map.getOrDefault(currentNumber, 0) + 1);
            
            
            if (map.get(currentNumber) > winningTarget) {
                return currentNumber; 
            }
        }
        
        return -1;
        
    }
}