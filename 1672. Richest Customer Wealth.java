 class Solution {
    public int maximumWealth(int[][] accounts) {
        int largest_wealth = 0;
        for(int[] account : accounts){
            int wealth = 0;
            for(int value: account ){
                wealth = wealth + value;
            }
            largest_wealth = (wealth > largest_wealth) ? wealth : largest_wealth;
        }
        return largest_wealth;
    }
}
