import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
            char[] a = s.toCharArray();
            char[] b = t.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a,b)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
