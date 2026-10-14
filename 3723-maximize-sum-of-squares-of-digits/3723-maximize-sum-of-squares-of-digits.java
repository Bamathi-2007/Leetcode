class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();

        if(sum > 9*num){
            return "";
        }

        int count9 = sum/9;
        int remainder = sum %= 9;
        
        for(int i=0; i<count9; i++){
            sb.append('9');
        }

        if(remainder != 0){
            sb.append(remainder);
        }

        while(sb.length() < num){
            sb.append('0');
        }

        return sb.toString();
    }
}