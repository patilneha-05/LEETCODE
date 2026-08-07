class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] result = nums.clone();

        for (int i = 0; i < k; i++) {
            int minIndex = 0;
            for (int j = 1; j < result.length; j++) {
                if (result[j] < result[minIndex]) {
                    minIndex = j;
                }
            }

            result[minIndex] *= multiplier;
        }

        return result;
    }
}