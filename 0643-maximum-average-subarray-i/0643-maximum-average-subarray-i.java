class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0, sum = 0;
        int n = nums.length;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        avg = sum / k;
        double maxAvg = avg;
        for(int i = 1; i <= n - k; i++){
            sum = sum - nums[i - 1] + nums[i + k - 1];
            avg = sum / k;
            
            maxAvg = Math.max(maxAvg, avg);
        }
        return maxAvg;
    }
}