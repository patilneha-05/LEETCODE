
#include<stdio.h>
#include<stdlib.h>

int* plusOne(int* digits, int digitsSize, int* returnSize) 
{
	int i;
	for(i=digitsSize-1; i>=0; i--)
	{
		if(digits[i]<9)
		{
			digits[i]+=1;
			*returnSize = digitsSize;
			return digits;	
		}
		digits[i] = 0;	
	}
	
	//IN ALL DIGITS ARE NINE
	int*result = (int*)malloc((digitsSize+1)*sizeof(int));
	result[0] = 1;
	for(i=1; i<=digitsSize;i++)
	{
		result[i] = 0;	
	}
	*returnSize = digitsSize+1;
	return result;    
}
void printArray(int*digits, int size)
{
	int i;
	printf("[");
	for(i=0;i<size;i++)
	{
		printf("%d",digits[i]);
		if(i<size-1)
			printf(",");
	}
	printf("]");
}
// int main(int argc, char*argv[])
// {
// 	//CASE 1
// 	int array[] = {1,2,3};
// 	int size = sizeof(array)/sizeof(array[0]);
// 	int *result,returnSize;

// 	result = plusOne(array,size,&returnSize);
// 	printArray(result,returnSize);
	
// 	//CASE 2
// 	int array2[] = {4,3,2,1};
// 	int size2 = sizeof(array2)/sizeof(array2[0]);
// 	int *result1,returnSize2;
	
// 	result1 = plusOne(array2,size2,&returnSize2);
// 	printArray(result1,returnSize2);
	
// 	//CASE 3
// 	int array3[] = {9};
// 	int size3 = sizeof(array3)/sizeof(array3[0]);
// 	int *result3,returnSize3;
	
// 	result3 = plusOne(array3,size3,&returnSize3);
// 	printArray(result3,returnSize3);
// }