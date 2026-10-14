class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();

        if(sum > 9*num){
            return "";
        }

        for(int i=0; i<num; i++){
            int digit = Math.min(9, sum);
            sum -= digit;
            sb.append(digit);
        }

        return sb.toString();
    }
}