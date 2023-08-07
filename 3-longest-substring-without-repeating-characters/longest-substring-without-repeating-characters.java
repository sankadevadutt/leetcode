class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0, right = s.length();
        int ans = 0;
        while(left<right){
            int k = left;
            Map<Character,Integer> mp = new HashMap<>();
            while(left<right && !mp.containsKey(s.charAt(left))){
                mp.put(s.charAt(left),left);
                left++;
            }
            ans = Math.max(ans,left-k);
            if(left<right) left = mp.get(s.charAt(left))+1;
                                
        }                
        return ans;

    }
}