class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] sqr = new int[n];

        for(int i=0; i<n; i++){
            sqr[i] = nums[i] * nums[i];
        }

        for(int i=0; i<n; i++){
            for(int j=i+1; j<nums.length; j++){
                if(sqr[i] > sqr[j]){
                    int temp = sqr[i];
                    sqr[i] = sqr[j];
                    sqr[j] = temp;
                }
            }
        }

        return sqr;
    }
}