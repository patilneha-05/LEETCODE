class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int size = nums.length;

        Arrays.sort(nums);
        int mini = nums[0];

        for(int num : nums){
            while(mini < num){
                list.add(mini);
                mini++;
            }
            mini = num + 1;
        }
        
        return list;
    }
}