class Solution {
    
    public boolean isCommon(String[] strs, String st){
        
        for(String s : strs){
            if(s.indexOf(st) != 0) return false;
        }
        return true;
           
    }
    
    public String longestCommonPrefix(String[] strs) {
        String cp = "";
        
        for(int i = 0;i<strs[0].length();i++){
            String cp2 = strs[0].substring(0,i+1);
            if(isCommon(strs,cp2)){
                cp = cp2;
            }else{
                return cp;
            }
        }
        
        return cp;
    }
}