class Solution {
    public int minOperations(int[] nums, int k) {
        int size = nums.length;
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += nums[i];
        }

        return sum % k;
    }
}