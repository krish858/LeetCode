import java.util.*;
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int le = len-1;
        int m = (int)Math.pow(10,le);
        int k = 0;
        for (int i = 0; i < len; i++) {
            k = k + digits[i]*m;
            m = m/10;
        }
        k = k = k + 1;
        int leng = String.valueOf(k).length();
        int[] ans = new int[leng];
        int lengt = leng - 1;
        int n = (int)Math.pow(10,lengt);
        for (int j = 0; j<leng ; j++) {
            ans[j] = k/n;
            k = k%n;
            n = n/10;
        }
        return ans;
    }
}
