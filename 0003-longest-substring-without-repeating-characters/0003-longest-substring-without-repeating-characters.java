class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i =0,j=0,max=0;
        int len = s.length();
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