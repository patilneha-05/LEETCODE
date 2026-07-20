
#include <stdlib.h>

typedef struct {
    int val, row, col;
} HeapNode;

int compare(const void* a, const void* b) {
    return ((HeapNode*)a)->val - ((HeapNode*)b)->val;
}

int kthSmallest(int** matrix, int matrixSize, int* matrixColSize, int k) {
    HeapNode* heap = (HeapNode*)malloc(matrixSize * sizeof(HeapNode));
    int heapSize = 0;
    for (int i = 0; i < matrixSize; i++) {
        heap[heapSize].val = matrix[i][0];
        heap[heapSize].row = i;
        heap[heapSize].col = 0;
        heapSize++;
    }
    qsort(heap, heapSize, sizeof(HeapNode), compare);
    for (int i = 1; i < k; i++) {
        HeapNode smallest = heap[0];
        heap[0] = heap[heapSize - 1];
        heapSize--;
        qsort(heap, heapSize, sizeof(HeapNode), compare);
        if (smallest.col + 1 < matrixColSize[smallest.row]) {
            heap[heapSize].val = matrix[smallest.row][smallest.col + 1];
            heap[heapSize].row = smallest.row;
            heap[heapSize].col = smallest.col + 1;
            heapSize++;
            qsort(heap, heapSize, sizeof(HeapNode), compare);
        }
    }
    int result = heap[0].val;
    free(heap);
    
    return result;
}
