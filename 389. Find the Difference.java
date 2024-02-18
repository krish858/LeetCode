class Solution {
    public char findTheDifference(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        int len = l1+l2;
        int k = 0;
        int[] a = new int[len];
        for (int i = 0; i < l1; i++) {
            a[i] = s.charAt(i);
        }
        for (int j = l1; j <len; j++) {
            a[j] = t.charAt(k);
            k = k+1;
        }
        int n = a.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans ^ a[i];
        }
        char answer = (char)ans;
        return answer;
    }
}
