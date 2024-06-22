class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length==2){
            return nums;
        }
        int res = 0;
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            res = res ^ nums[i] ;
        }
        int pos = 0 ;
        while( (res & 1) == 0 ){
            pos = pos + 1;
            res = res >> 1;
        }
        int a = 0;
        int b = 0;
        for(int i = 0; i<nums.length; i++){
            if( ((nums[i]>>pos)&1) == 1 ){
                a = a ^ nums[i];
            }else{
                b = b ^ nums[i];
            }
        }
        ans[0] = a;
        ans[1] = b;
        return ans;
    }
}
