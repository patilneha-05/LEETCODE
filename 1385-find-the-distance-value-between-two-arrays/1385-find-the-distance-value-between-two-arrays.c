#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int compare(const void* a, const void* b) {
    return (*(int*)a) - (*(int*)b);
}
int binarySearch(int* arr2, int arr2Size, int target) {
    int left = 0, right = arr2Size - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr2[mid] == target) {
            return mid;
        } else if (arr2[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return left; 
}
int findTheDistanceValue(int* arr1, int arr1Size, int* arr2, int arr2Size, int d) {
    qsort(arr2, arr2Size, sizeof(int), compare);
    int count = 0;
    for (int i = 0; i < arr1Size; i++) {
        int target = arr1[i];
        int idx = binarySearch(arr2, arr2Size, target);
        int valid = 1;
        if (idx < arr2Size && abs(arr2[idx] - target) <= d) {
            valid = 0;
        }
        if (idx > 0 && abs(arr2[idx - 1] - target) <= d) {
            valid = 0;
        }

        if (valid) {
            count++;
        }
    }
    return count;
}
