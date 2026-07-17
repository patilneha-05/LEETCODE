class Solution {
    public int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int pgcd[] = new int[n];
        int mx = 0;
        for(int i = 0; i < n; i++){
            mx = Math.max(mx, nums[i]);
            pgcd[i] = gcd(nums[i], mx);
        }
        Arrays.sort(pgcd);

        int l = 0;
        int r = n - 1;
        long ans = 0;
        while(l < r){
            ans += gcd(pgcd[l], pgcd[r]);
            l++;
            r--;
        }
        return ans;
    }
}