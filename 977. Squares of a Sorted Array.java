 
class Solution {
    public static int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int temp;
        for (int i = 0; i<len; i++){
            nums[i] = nums[i] * nums[i];
        }
        for (int j = 0; j < len-1; j++) {
            for (int k = j+1; k <len; k++) {
                if (nums[j] > nums[k]) {
                    temp = nums[j];
                    nums[j] = nums[k];
                    nums[k] = temp;
                }
            }
        }
        return nums;
    }
}
