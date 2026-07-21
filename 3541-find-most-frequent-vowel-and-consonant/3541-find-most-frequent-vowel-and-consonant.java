class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int max_v = 0;
        int max_c = 0;
        for(char ch : map.keySet()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                max_v = Math.max(max_v, map.get(ch));
            }
            else{
                max_c = Math.max(max_c, map.get(ch));
            }
        }
        return max_v + max_c;
    }
}