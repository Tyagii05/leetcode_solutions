class Solution {
    public int heightChecker(int[] heights) {
        
        int[] expected = heights.clone();
        
        int n = expected.length;
        for (int i = 0; i < n - 1; i++) {
            
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (expected[j] < expected[minIndex]) {
                    minIndex = j;
                }
            }
            
            if (minIndex != i) {
                int temp = expected[minIndex];
                expected[minIndex] = expected[i];
                expected[i] = temp;
            }
        }
        
        int mismatchCount = 0;
        
        for (int i = 0; i < heights.length; i++) {
            
            if (heights[i] != expected[i]) {
                mismatchCount++;
            }
        }
        
        return mismatchCount;
    }
}