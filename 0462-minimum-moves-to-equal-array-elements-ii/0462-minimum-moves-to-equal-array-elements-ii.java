class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int median = nums[n/2];

        int total_moves = 0;
        for(int num : nums){
            total_moves += Math.abs(num - median);
        }

        return total_moves;
    }
}