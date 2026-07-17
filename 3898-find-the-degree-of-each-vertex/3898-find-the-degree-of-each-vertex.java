class Solution {
    public int[] findDegrees(int[][] matrix) {
        int idx = 0;
        int[] ans = new int[matrix.length];
        
        for(int[] row : matrix){
            int sum = 0;
            for(int val : row){
                sum += val;
            }
            ans[idx++] = sum;
        }
        return ans;
    }
}