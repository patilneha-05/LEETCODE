#include <stdlib.h>

int specialArray(int* nums, int numsSize) {
    // Sort the array in ascending order
    for (int i = 0; i < numsSize - 1; i++) {
        for (int j = 0; j < numsSize - i - 1; j++) {
            if (nums[j] > nums[j + 1]) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
        }
    }

    for (int x = 1; x <= numsSize; x++) {
        int count = 0;
        for (int i = 0; i < numsSize; i++) {
            if (nums[i] >= x) {
                count++;
            }
        }
        if (count == x) {
            return x;
        }
    }
    return -1;
}