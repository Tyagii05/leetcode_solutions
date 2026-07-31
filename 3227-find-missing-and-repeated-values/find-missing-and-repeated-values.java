import java.util.HashSet;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int maxVal = n * n;
        HashSet<Integer> seen = new HashSet<>();
        
        int repeated = -1;
        int missing = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (!seen.add(grid[i][j])) {
                    repeated = grid[i][j];
                }
            }
        }

        for (int i = 1; i <= maxVal; i++) {
            if (!seen.contains(i)) {
                missing = i;
                break; 
            }
        }

        return new int[]{repeated, missing};
    }
}