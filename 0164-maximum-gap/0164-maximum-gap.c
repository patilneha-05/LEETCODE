
#include <stdlib.h>

int maximumGap(int* nums, int numsSize) {
    if (numsSize < 2) return 0;
    int minVal = nums[0], maxVal = nums[0];
    for (int i = 1; i < numsSize; i++) {
        if (nums[i] < minVal) minVal = nums[i];
        if (nums[i] > maxVal) maxVal = nums[i];
    }
    int bucketSize = (maxVal - minVal) / (numsSize - 1);
    if (bucketSize == 0) bucketSize = 1; 

    int bucketCount = (maxVal - minVal) / bucketSize + 1;
    int* bucketMin = (int*)malloc(bucketCount * sizeof(int));
    int* bucketMax = (int*)malloc(bucketCount * sizeof(int));
    
    for (int i = 0; i < bucketCount; i++) {
        bucketMin[i] = -1;  
        bucketMax[i] = -1;
    }
    for (int i = 0; i < numsSize; i++) {
        int idx = (nums[i] - minVal) / bucketSize;
        if (bucketMin[idx] == -1 || nums[i] < bucketMin[idx]) bucketMin[idx] = nums[i];
        if (bucketMax[idx] == -1 || nums[i] > bucketMax[idx]) bucketMax[idx] = nums[i];
    }
    int maxGap = 0;
    int prevMax = minVal;
    for (int i = 0; i < bucketCount; i++) {
        if (bucketMin[i] == -1) continue;
        maxGap = (bucketMin[i] - prevMax > maxGap) ? bucketMin[i] - prevMax : maxGap;
        prevMax = bucketMax[i];
    }
    free(bucketMin);
    free(bucketMax);

    return maxGap;
}

