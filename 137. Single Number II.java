class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int sum=0;
        if(len==1){
            return nums[0];
        }
        for(int i=1; i<len; i++){
            if(nums[i]==nums[i-1]){
                i++;
                i++;
            }else{
                sum = sum + nums[i-1];
            }
        }
        if(sum == 0){
            if(nums[len-1]==nums[len-2]){
               return 0;
            }else{
                return nums[len-1];
            }
        }else{
            return sum;
        }
    }
}
