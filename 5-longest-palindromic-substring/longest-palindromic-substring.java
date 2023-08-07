class Solution {
    public String helper(String s, int start, int end){
        while(start>=0 && end<s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        return s.substring(start+1,end);
    }
    public String longestPalindrome(String s) {
        String ans = "";
        int max = 0;
        for(int i = 0;i<s.length();i++){
            String s1 = helper(s,i,i);
            String s2 = helper(s,i,i+1);
            int len1 = s1.length();
            int len2 = s2.length();
            if(len1>len2 && len1>max){
                max = len1;
                ans = s1;
            }else if(len2>len1 && len2>max){
                max = len2;
                ans = s2;
            }
        }
        return ans;
    }
}