class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i =0;
        int len = s.length();
        int j = 0;
        int max = 0;
        while(i<len){
            Map<Character,Integer> mp = new HashMap<>();
            while(j<len && !mp.containsKey(s.charAt(j))){
                mp.put(s.charAt(j),0);
                j++;
            }
            max = Math.max(mp.size(),max);
            i++;
            j =i;
        }
        return max;
    }
}