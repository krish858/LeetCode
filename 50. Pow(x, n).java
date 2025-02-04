class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        if(n < -2147483647 && x != 1 && x != -1){
            return 0;
        }
        if(n < 0){
            n = n * -1;
            x = 1 / x;
        }
        while(n > 0){
            int lastbit = n & 1;
            if(lastbit == 1){
                ans = ans * x;
            }
            x = x * x;
            n = n >> 1;
        }
        return ans;
    }
}
