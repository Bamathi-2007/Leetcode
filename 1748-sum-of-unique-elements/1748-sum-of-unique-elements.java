class Solution {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        int sum = 0;

        for(int num : nums){
            count[num]++;
        }

        for(int i=0; i<count.length; i++){
            if(count[i] == 1){
                sum += i;
            }
        }

        return sum;
    }
}