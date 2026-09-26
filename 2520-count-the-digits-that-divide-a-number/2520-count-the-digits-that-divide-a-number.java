class Solution {
    public int countDigits(int num) {
        int count = 0;
        int x =  num; int digit = 0;

        while(x != 0){
            digit = x % 10;

            if(num % digit == 0){
                count++;
            }
            x /= 10;
        }

        return count;
    }
}