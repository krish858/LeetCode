class Solution {
    public boolean isPowerOfTwo(int n) {
       int ans = n & n-1;
       if(n<1){
           return false;
       }if(ans == 0){
           return true;
       }else{
           return false;
       }

    }
}
