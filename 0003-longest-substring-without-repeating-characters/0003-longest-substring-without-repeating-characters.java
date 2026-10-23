class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int right = 0; int left = 0;
        int count = 0; int max = 0;

        for(int i=0; i<s.length(); i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
            else{
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(i));
            }
            right = i;
            count = right - left + 1;
            max = Math.max(count, max);
        }
        return max;
    }
}