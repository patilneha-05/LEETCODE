class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];
        for(int i = 0; i < nums.length; i++){
            sum += nums[i]; 
            //maxSum = Math.max(maxSum, sum);
            maxSum = sum > maxSum ? sum : maxSum;
            sum = sum < 0 ? 0 : sum;
        }
        //System.gc();
        return maxSum;
    }
}