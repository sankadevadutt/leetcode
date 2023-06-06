class Solution {
    
    public List<String> generateParenthesis(int n) {
        
        List<String> ans = new ArrayList<>();
        ans.add("()");
        
        int k = 1 ;
        while(k<n){
            List<String> temp = new ArrayList<>();
            for(String s : ans){
                for(int i = 0 ; i < s.length() ; i++){
                    StringBuilder sb = new StringBuilder(s);
                    sb.insert(i,"()");
                    String ins = sb.toString();
                    if(!temp.contains(ins)) temp.add(ins);
                }
            }
            
            k++;
            ans = temp;
        }
        return ans;
    }
}