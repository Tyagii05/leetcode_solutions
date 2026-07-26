class Solution {
    public int findNumbers(int[] nums) {
        int addy = 0; 

        for(int i = 0; i < nums.length; i++){
            
            int digitCount = String.valueOf(nums[i]).length();
            
            if(digitCount % 2 == 0){
                addy++;
            }
        }
        
        return addy; 
    }
}