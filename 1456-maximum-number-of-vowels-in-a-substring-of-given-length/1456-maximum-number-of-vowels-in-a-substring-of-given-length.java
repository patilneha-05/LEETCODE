
class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;

        // Count vowels in first window
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        int maxcount = count;

        for (int i = k; i < s.length(); i++) {

            // Remove left character
            char left = s.charAt(i - k);
            if (left == 'a' || left == 'e' || left == 'i' ||
                left == 'o' || left == 'u') {
                count--;
            }

            // Add right character
            char right = s.charAt(i);
            if (right == 'a' || right == 'e' || right == 'i' ||
                right == 'o' || right == 'u') {
                count++;
            }

            maxcount = Math.max(maxcount, count);
        }

        return maxcount;
    }
}