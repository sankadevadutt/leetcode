class Solution {
    public String pal(String s, int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
    public String longestPalindrome(String s) {
        String res = "";
        int n = s.length();
        for(int i =0;i<n;i++){
            String s1 = pal(s,i,i);
            String s2 = pal(s,i,i+1);
            if(s1.length() > s2.length() && s1.length() > res.length())
                res = s1;
            else if(s2.length() >= s1.length() && s2.length() > res.length())
                res = s2;
        }
        
        return res;
    }
}