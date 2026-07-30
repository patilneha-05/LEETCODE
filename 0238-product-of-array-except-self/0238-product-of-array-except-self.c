#include <stdlib.h>

int* productExceptSelf(int* nums, int numsSize, int* returnSize) {
    *returnSize = numsSize; // Set the return size
    int* result = (int*)malloc(numsSize * sizeof(int));
    if (!result) return NULL; // Check for malloc failure

    // Step 1: Compute the product of elements to the left of each index
    int leftProduct = 1;
    for (int i = 0; i < numsSize; i++) {
        result[i] = leftProduct; // Store the product of elements to the left
        leftProduct *= nums[i]; // Update the left product
    }

    // Step 2: Compute the product of elements to the right of each index
    int rightProduct = 1;
    for (int i = numsSize - 1; i >= 0; i--) {
        result[i] *= rightProduct; // Multiply with the product of elements to the right
        rightProduct *= nums[i]; // Update the right product
    }

    return result;
}
