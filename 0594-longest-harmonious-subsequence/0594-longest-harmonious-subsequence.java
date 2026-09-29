class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = 0; int max = 0;
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()){
            int pair = key + 1;
            if(map.containsKey(pair)){
                len = map.get(key) + map.get(pair);
                max = Math.max(len, max);
            }
        }

        return max;
    }
}