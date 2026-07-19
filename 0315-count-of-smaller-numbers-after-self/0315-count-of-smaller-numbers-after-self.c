void update(int* bit, int index, int size) {
    while (index < size) {
        bit[index]++;
        index += index & -index;
    }
}

int query(int* bit, int index) {
    int sum = 0;
    while (index > 0) {
        sum += bit[index];
        index -= index & -index;
    }
    return sum;
}

int* countSmaller(int* nums, int numsSize, int* returnSize) {
    *returnSize = numsSize;
    int* result = (int*)malloc(numsSize * sizeof(int));
    int offset = 10001;
    int size = 2 * offset + 1;

    int* bit = (int*)calloc(size, sizeof(int));

    for (int i = numsSize - 1; i >= 0; i--) {
        int index = nums[i] + offset;
        result[i] = query(bit, index - 1);
        update(bit, index, size);        
    }

    free(bit);
    return result;
}