class Solution {

    public boolean isPalindrome(String s){
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String ans = "";
        if(s.length() == 1)
            return s;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                
                String sub = s.substring(i, j+1);

                if(isPalindrome(sub) && sub.length() > ans.length()){
                    ans = sub;
                }
            }
        }
        return ans;
    }
}