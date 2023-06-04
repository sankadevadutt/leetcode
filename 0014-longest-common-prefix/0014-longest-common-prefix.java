class Solution {
    public String lcp(String[] strs, int ind){
        String cp = strs[0].substring(0,ind);
        for(String str : strs){
            if(str.indexOf(cp) != 0) return cp.substring(0,cp.length()-1);
        }
        ind++;
        if(ind <= strs[0].length()) return lcp(strs,ind);
        return cp;
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs[0].length() == 0) return "";
        return lcp(strs,1);
    }
}