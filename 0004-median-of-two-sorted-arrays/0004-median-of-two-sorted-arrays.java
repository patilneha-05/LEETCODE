class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int low = 0;
        int high = nums1.length;

        int l1 = 0, l2 = 0;
        int r1 = 0, r2 = 0;

        int partition1 = 0;
        int partition2 = 0;
        int totalLength = nums1.length + nums2.length;
        while (low <= high) {

            partition1 = (low + high) / 2;
            partition2 = (totalLength + 1) / 2 - partition1;

            l1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            r1 = (partition1 == nums1.length) ? Integer.MAX_VALUE : nums1[partition1];

            l2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            r2 = (partition2 == nums2.length) ? Integer.MAX_VALUE : nums2[partition2];

            if (l1 <= r2 && l2 <= r1) {

                if (totalLength % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                }
                return Math.max(l1, l2);
            } else if (l1 > r2) {
                high = partition1 - 1;
            }

            else {
                low = partition1 + 1;
            }
        }

        return 0.0;
    }
}
