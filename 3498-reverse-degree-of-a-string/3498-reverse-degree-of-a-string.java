class Solution {
    public int reverseDegree(String s) {
        int sum = 0; char ch; int val;

        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            val = 'z' - ch +1;
            sum += val*(i+1);
        }
        return sum;
    }

}