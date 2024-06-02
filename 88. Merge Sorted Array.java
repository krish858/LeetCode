import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i<n; i++){
            if(n==0){
                break;
            }
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
