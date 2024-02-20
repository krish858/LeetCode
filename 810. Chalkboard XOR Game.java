class Solution {
    public boolean xorGame(int[] nums) {
       int len = nums.length;
       int x = 0;
       for (int i=0; i<len; i++){
           x = x^nums[i];
       }
       if(x==0){
           return true;
       }else if(len%2==0){
           return true;
       }else{
           return false;
       }
    }
}
