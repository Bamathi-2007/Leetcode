class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(char ch : s.toCharArray()){
            if(ch == '(' && count++ > 0){
                sb.append(ch);
            }
            else if(ch == ')' && --count>0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}