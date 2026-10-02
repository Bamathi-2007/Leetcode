class Solution {
    public int minimumRecolors(String blocks, int k) {
        Character[] string = new Character[blocks.length()];
        int min = Integer.MAX_VALUE;

        for(int i=0; i<blocks.length(); i++){
            string[i] = blocks.charAt(i);
        }

        int i=0; int j=k;

        while(j <= string.length){
            int count = 0;
            while(i < j){
                if(string[i] == 'W'){
                    count++;
                }
                i++;
            }
            min = Math.min(count, min);
            j++;
            i = j - k;
        }

        return min;
    }
}