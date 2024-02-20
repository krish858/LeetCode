import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length + 1;
        int ans = 0;
        for (int i=0; i < nums.length; i++){
            ans = ans+nums[i];
        }
        for (int j =0; j<len; j++){
            ans=ans-j;
        }
        ans = ans * -1;
        return ans;
    }
}
