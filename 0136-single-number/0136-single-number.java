class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int n : nums){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        int res = 0;
        for(Integer n : freq.keySet()){
            if(freq.get(n) == 1){
                res = n;
            }
        }

        return res;
    }
}