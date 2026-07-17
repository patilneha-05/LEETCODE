class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;
        int size = s.length();
        HashSet<Character> set = new HashSet<>();
        for(int right = 0; right < size; right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}