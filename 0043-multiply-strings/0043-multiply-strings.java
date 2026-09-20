class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();

        int[] res = new int[m+n];

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';
                int temp = res[i+j+1]+(a*b);

                res[i+j+1] = temp % 10;
                res[i+j] += (temp / 10);
            }
        }
        StringBuilder sb= new StringBuilder();
        for (int a:res){
            if (sb.length() == 0 && a == 0) continue;
            sb.append(a);
        }

        return sb.toString();
    }
}