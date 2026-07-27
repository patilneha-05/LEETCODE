class Solution {
    public int maxProduct(int[] nums) {
      
    //   int mx1 = 0, mx2 = 0;
    //   for(int n : nums){
    //     mx2 = Math.max(mx2, Math.min(mx1, n));
    //     mx1 = Math.max(mx1, n);
    //   }
    //   return (mx1 - 1)*(mx2 - 1);
        Arrays.sort(nums);
        int n = nums.length;
        return (nums[n - 1] - 1)*(nums[n - 2] - 1);

    }
}