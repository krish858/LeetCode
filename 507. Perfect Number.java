class Solution {
    public boolean checkPerfectNumber(int num) {
        int ans = 0;
        for(int i =1; i<num; i++){
            if(num%i==0){
                ans = ans+i;
            }
        }
        if(num==ans){
            return true;
        }else{
            return false;
        }
    }
}
