class Solution {
    public int reverseDegree(String s) {
        int sum = 0; char ch; int val;

        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            val = 123 - ch;
            sum += val*(i+1);
        }
        return sum;
    }

}