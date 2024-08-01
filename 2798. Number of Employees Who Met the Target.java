class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int hour : hours ){
            count = (hour >= target) ? (count + 1) : count ;
        }
        return count;
    }
}
