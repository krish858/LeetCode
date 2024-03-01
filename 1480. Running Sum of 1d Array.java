 class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] a = new int[len];
        int sum = 0;
        for (int i=0; i<len; i++){
            sum = sum + nums[i];
            a[i] = sum;
        }
        return a;
    }
}
