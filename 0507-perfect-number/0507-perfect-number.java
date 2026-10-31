class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 1;
        int x = num;

        for(int i=2; i*1<=x; i++){
            if(x % i == 0){
                sum += i;
            }
        }
        sum -= num;
        return sum == num;
    }
}