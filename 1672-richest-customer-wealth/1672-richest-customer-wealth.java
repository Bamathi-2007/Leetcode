class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth = 0;

        for(int[] row : accounts){
            int wealth = 0; 
            for(int num : row){
                wealth += num;
            }
            max_wealth = Math.max(max_wealth, wealth);
        }

        return max_wealth;
    }
}