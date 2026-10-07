class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] pref = new int[nums.length];
        int count = 0;

        map.put(0, 1);

        pref[0] = nums[0];
   
        if (map.containsKey(pref[0] - k)) {
            count += map.get(pref[0] - k);
        }

        map.put(pref[0], map.getOrDefault(pref[0], 0) + 1);

        for (int i = 1; i < nums.length; i++) {
            pref[i] = pref[i - 1] + nums[i];

            if (map.containsKey(pref[i] - k)) {
                count += map.get(pref[i] - k);
            }

            map.put(pref[i], map.getOrDefault(pref[i], 0) + 1);
        }

        return count;
    }
}
