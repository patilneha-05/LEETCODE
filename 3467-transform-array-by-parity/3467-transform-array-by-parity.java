class Solution {
    public int[] transformArray(int[] nums) {
        int ec = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 0){
                ec++;
            }
        }
        int oc = n - ec;
        for(int i = 0; i < ec; i++){
            nums[i] = 0;
        }
        for(int i = ec; i < n; i++){
            nums[i] = 1;
        }
        return nums;
    }
}