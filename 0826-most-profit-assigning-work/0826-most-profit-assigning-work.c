#include <stdio.h>
#include <stdlib.h>

// Comparison function to sort jobs by difficulty
int compareJobs(const void* a, const void* b) {
    return ((int*)a)[0] - ((int*)b)[0];  // Compare by difficulty
}

// Comparison function to sort workers by ability
int compareWorkers(const void* a, const void* b) {
    return *(int*)a - *(int*)b;  // Compare by ability
}

int maxProfitAssignment(int* difficulty, int difficultySize, int* profit, int profitSize, int* worker, int workerSize) {
    // Create an array of jobs (difficulty, profit)
    int jobs[difficultySize][2];
    for (int i = 0; i < difficultySize; i++) {
        jobs[i][0] = difficulty[i];
        jobs[i][1] = profit[i];
    }

    // Sort jobs by difficulty
    qsort(jobs, difficultySize, sizeof(jobs[0]), compareJobs);

    // Sort workers by ability
    qsort(worker, workerSize, sizeof(int), compareWorkers);

    // Max profit variable
    int maxProfit = 0;
    int jobIndex = 0;
    int currentMaxProfit = 0;

    // Iterate over each worker
    for (int i = 0; i < workerSize; i++) {
        // Update the current maximum profit for jobs that the worker can do
        while (jobIndex < difficultySize && jobs[jobIndex][0] <= worker[i]) {
            currentMaxProfit = (currentMaxProfit > jobs[jobIndex][1]) ? currentMaxProfit : jobs[jobIndex][1];
            jobIndex++;
        }
        // Add the max profit that this worker can achieve
        maxProfit += currentMaxProfit;
    }

    return maxProfit;
}

