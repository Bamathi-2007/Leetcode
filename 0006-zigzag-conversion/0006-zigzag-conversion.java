class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }

        int row = 0; int d = 1;
        StringBuilder[] rows = new StringBuilder[numRows];
        StringBuilder sb = new StringBuilder();

        for (int i=0;i<numRows;i++){
            rows[i] = new StringBuilder();
        }

        for(int i=0; i<s.length(); i++){
            rows[row].append(s.charAt(i));
            if(row == 0){
                d=1;
            }
            else if(row == numRows-1){
                d=-1;
            }
            row+=d;

        }
        for (StringBuilder st : rows){
            sb.append(st);
        }
        return sb.toString();

    }
}