import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        
        for (int i = 0; i < n - 1; i++) {
            
            int minIndex = i;
            
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j; 
                }
            }
            
            if (minIndex != i) {
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
            
            if (nums[i] > target) {
                break;
            }
        }
        
        return result;
    }
}