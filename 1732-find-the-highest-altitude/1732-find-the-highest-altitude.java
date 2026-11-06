class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] pref = new int[n+1];
        int max = 0;

        pref[0] = 0;

        for(int i=0; i<gain.length; i++){
            pref[i+1] = pref[i] + gain[i];
            max = Math.max(pref[i+1], max);
        }

        return max;
    }
}