import java.util.*;
class Solution {
    public int scoreOfString(String s) {
        int ans = 0;
        int len = s.length();
        for(int i = 0; i < len; i = i +2){
            if(i == 0){
                ans = ans + Math.abs( (int)s.charAt(i) - (int)s.charAt(i + 1) );
            }else if( i == len -1 ){
                ans = ans + Math.abs( (int)s.charAt(i - 1) - (int)s.charAt(i) );
            }else{
                ans = ans + Math.abs( (int)s.charAt(i - 1) - (int)s.charAt(i) );
                ans = ans + Math.abs( (int)s.charAt(i) - (int)s.charAt(i + 1) );
            }
        }
        return ans;
    }
    
                
}
