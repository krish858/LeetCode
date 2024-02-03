import java.util.*;
class Solution {

    public static int[] twoSum(int[] nums, int target) {
        int c;
        c = nums.length;
        int[] ans = new int[2];
        for(int i=0; i<c; i++){
            for(int j=0; j<c; j++){
                if(nums[i]+nums[j]==target){
                    if(i==j){
                        continue;
                    }else{
                        ans[0] = j;
                        ans[1] = i;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}