class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length() - 1;
        while(len >= 0 && s.charAt(len) == ' '){
            len--;
        }
        int counter = 0;
        while(len >= 0 && s.charAt(len) != ' '){
            counter++;
            len--;
        }
        return counter;
    }
}
