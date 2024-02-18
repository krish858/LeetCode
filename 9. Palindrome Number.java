class Solution {
    public boolean isPalindrome(int x) {
        int b = 0;
        int y = x;
        int c;
        if(x<0){
            return false;
        }else{
            while (x>0){
                c = x%10;
                b = b*10;
                b = b+c;
                x = x/10;
            }
            if(b==y){
                return true;
            }else{
                return false;
            }
        }
    }
}
