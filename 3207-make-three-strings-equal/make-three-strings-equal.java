class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int len = Math.min(s1.length(),s2.length());
        len = Math.min(len,s3.length());
        int equal = 0;
        for(int i = 0;i < len;i++){
            if(s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == s3.charAt(i)) equal++;
            else break;
        }
        if(equal == 0) return -1;
        return (s1.length() + s2.length() + s3.length() - 3*equal);
    }
}