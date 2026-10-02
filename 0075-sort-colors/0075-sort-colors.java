class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int red = 0; int white = 0; int blue = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                red++;
            }
            if(nums[i] == 1){
                white++;
            }
            if(nums[i] == 2){
                blue++;
            }
        }
        
        for(int i=0; i<red; i++){
            nums[i] = 0;
        }

        for(int j=red; j<white+red; j++){
            nums[j] = 1;
        }

        for(int k=white+red; k<blue+red+white; k++){
            nums[k] = 2;
        }
    }
}