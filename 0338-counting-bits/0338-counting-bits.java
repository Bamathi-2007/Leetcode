class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        for(int i=0; i<ans.length; i++){
            int count = 0;
            for(int k=0; k<32; k++){
                if((i & (1<<k)) != 0){
                    count++;
                }
            }
            ans[i] = count;
        }

        return ans;
    }
}