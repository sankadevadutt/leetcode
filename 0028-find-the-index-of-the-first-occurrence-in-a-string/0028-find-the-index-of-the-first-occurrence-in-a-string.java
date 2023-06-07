class Solution {
    public int strStr(String haystack, String needle) {
        
        int len1 = haystack.length(), len2 = needle.length();
        
        if(len1 < len2) return -1;
        
        if(len1 == len2) return (haystack.equals(needle) == true ? 0 :-1);
        
        for(int i = 0 ; i <= len1-len2; i++){
            String substr = haystack.substring(i,i+len2);
            if(needle.equals(substr)) return i;
        }
        return -1;
        
        
        
        // or can simply do
        // return haystack.indexOf(needle);   
    }
}