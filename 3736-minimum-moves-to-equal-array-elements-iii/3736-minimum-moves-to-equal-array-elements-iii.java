class Solution {
    public int minMoves(int[] nums) {
        int max = 0;

        for(int num : nums){
            max = Math.max(max, num);
        }

        int total_moves = 0;

        for(int num : nums){
            total_moves += Math.abs(num - max);
        }

        return total_moves;
    }
}