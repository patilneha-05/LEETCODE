/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* sortedSquares(int* nums, int numsSize, int* returnSize) 
{
	int *returnArr = (int*)malloc(numsSize * sizeof(int));
    
    int l = 0;
    int r = numsSize-1;
    int s = numsSize-1;
    
    while (l <= r)
    {
        if (nums[r]*nums[r] > nums[l]*nums[l])
        {
            returnArr[s--] = nums[r]*nums[r];
            r--;
        }
        else
        {
            returnArr[s--] = nums[l]*nums[l];
            l++;
        }
    }
    
    *returnSize = numsSize;
    return returnArr;
}

