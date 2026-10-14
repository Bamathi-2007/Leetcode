class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) return "";

        StringBuilder sb = new StringBuilder(num);

        for (int i = 0; i < num; i++) {
            int digit = Math.min(9, sum);
            sb.append((char)('0' + digit));
            sum -= digit;
        }

        return sb.toString();
    }
}