class Solution {
    public int findGCD(int[] nums) {
        int size = nums.length;
        int mx = nums[0];
        int mn = nums[0];
        int gcd = 1;
        
        for(int i = 0; i < size; i++){
            if(mn > nums[i]){
                mn = nums[i];
            }

            if(mx < nums[i]){
                mx = nums[i];
            }
        }
 
        for(int i = 1; i <= mn; i++){
            if(mn % i == 0 && mx % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}