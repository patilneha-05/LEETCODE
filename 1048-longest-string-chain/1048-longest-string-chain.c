#include <stdlib.h>
#include <string.h>
int compareWords(const void* a, const void* b) {
    return strlen(*(char**)a) - strlen(*(char**)b);
}
int isPredecessor(char* word1, char* word2) {
    int len1 = strlen(word1), len2 = strlen(word2);
    if (len2 != len1 + 1) return 0;  
    int i = 0, j = 0;
    while (i < len1 && j < len2) {
        if (word1[i] == word2[j]) {
            i++;
        }
        j++;
    }
    return i == len1; 
}
int longestStrChain(char** words, int wordsSize) {
    qsort(words, wordsSize, sizeof(char*), compareWords);
    int* dp = (int*)malloc(wordsSize * sizeof(int));
    for (int i = 0; i < wordsSize; i++) {
        dp[i] = 1;
    }
    int maxChainLength = 1;
    for (int i = 1; i < wordsSize; i++) {
        for (int j = 0; j < i; j++) {
            if (isPredecessor(words[j], words[i])) {
                dp[i] = (dp[i] > dp[j] + 1) ? dp[i] : dp[j] + 1;
            }
        }
        maxChainLength = (maxChainLength > dp[i]) ? maxChainLength : dp[i];
    }
    free(dp);
    return maxChainLength;
}
