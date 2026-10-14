class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count = 0;int min = Integer.MAX_VALUE;

        int sum = 0; int left = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];

            while (sum >= target) {
                count = i - left + 1;
                min = Math.min(count, min);
                sum -= nums[left];
                left++;
            }
        }
        
        if(min == Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}