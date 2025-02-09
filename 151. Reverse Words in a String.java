class Solution {
    public String reverseWords(String s) {
        String[] a = s.trim().split("\\s+");
        String b;
        int start = 0;
        int end = a.length - 1;
        while(start < end){
            b = a[start];
            a[start] = a[end];
            a[end] = b;
            start++;
            end--;
        }
        b = String.join(" ",a);
        return b;
    }
}
