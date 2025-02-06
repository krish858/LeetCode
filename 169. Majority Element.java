class Solution {
    public int majorityElement(int[] nums) {
        int n = -1;
        int freq = 0;
        for(int num: nums){
            if(freq == 0){
                n = num;
                freq = 0;
            }
            if(num == n){
                freq++;
            }else{
                freq--;
            }
        }
        return n;
    }
}
