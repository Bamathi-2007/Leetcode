class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int total_moves = 0;
        
        for(int i=0; i<n; i++){
            min = Math.min(min, nums[i]);
        }

        for(int num : nums){
            total_moves += num - min;
        }

        return total_moves;
    }
    
}