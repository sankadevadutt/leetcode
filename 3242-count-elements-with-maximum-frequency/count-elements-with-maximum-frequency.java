class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxFreq = Integer.MIN_VALUE;
        int ans = 0;
        
        Map<Integer, Integer> mp = new HashMap<>();
        
        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
            maxFreq = Math.max(maxFreq, mp.get(i));
        }

        for(int i : mp.values()) if(i == maxFreq) ans++;

        return ans*maxFreq;
    }
}