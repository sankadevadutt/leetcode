class Solution {
    public boolean lcp(String[] strs, String s){
        for(String st : strs) if(st.indexOf(s)!=0) return false;
        return true;
    }
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        for(int i = 0;i<strs[0].length();i++){
            String s = strs[0].substring(0,i+1);
            if(lcp(strs,s)){
                ans = s;
            }else{
                return ans;
            }
        }
        return ans;
    }
}