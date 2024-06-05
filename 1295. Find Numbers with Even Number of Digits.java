class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int digitcount =0;
        for(int i = 0; i < nums.length; i++ ){
            while(nums[i]>0){
                nums[i] = nums[i] / 10;
                digitcount++;
            }
            if(digitcount % 2 == 0){
                count++;
            }
            digitcount = 0;
        }
        return count;
    }
}
