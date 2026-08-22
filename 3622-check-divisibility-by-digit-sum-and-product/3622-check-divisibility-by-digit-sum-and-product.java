class Solution {
    public int sum(int n) {
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem;

            n = n / 10;
        }
        return sum;
    }

    public int product(int n){
        int product = 1;
        while(n > 0){
            int rem = n % 10;
            product *= rem;
            n = n / 10;
        }
        return product;
    }
    public boolean checkDivisibility(int n) {
        
        int addition = sum(n) + product(n);
        if(n % addition == 0){
            return true;
        }

        return false;
    }
}