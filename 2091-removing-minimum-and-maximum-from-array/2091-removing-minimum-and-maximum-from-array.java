class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        int minIndex = 0;
        int maxIndex = 0;

        // Find index of minimum and maximum
        for (int i = 0; i < n; i++) {

            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }

            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        // Make minIndex the smaller index
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }

        // Case 1: Both removed from left
        int left = maxIndex + 1;

        // Case 2: Both removed from right
        int right = n - minIndex;

        // Case 3: One from left, one from right
        int both = (minIndex + 1) + (n - maxIndex);

        return Math.min(left, Math.min(right, both));
    }
}