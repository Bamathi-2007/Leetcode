class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] ch = new char[s.length()];
        int count = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }

        for(int j=0; j<count-1; j++){
            ch[j] = '1';
        }

        for(int i=count-1; i<ch.length-1; i++){
            ch[i] = '0';
        }

        ch[s.length() - 1] = '1';

        String result = String.valueOf(ch);

        return result;
    }
}