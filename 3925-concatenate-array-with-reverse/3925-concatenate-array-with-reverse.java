class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length + nums.length;
        int[] res = new int[n];

        for(int i = 0, j = n - 1; i < nums.length; i++, --j){
            res[i] = nums[i];
            res[j] = nums[i];
        }
        return res;
    }
}