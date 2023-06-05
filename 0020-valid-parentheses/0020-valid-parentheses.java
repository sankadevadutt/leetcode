class Solution {
    public boolean isValid(String s) {
        
        Map<Character,Character> mp = new HashMap<>();
        
        mp.put('(',')');
        mp.put('[',']');
        mp.put('{','}');
        
        
        Stack<Character> st = new Stack<>();
        for(int i =0;i<s.length();i++){
            
            char ch = s.charAt(i);
            
            if(mp.keySet().contains(ch))    st.push(ch);
            
            else if(mp.values().contains(ch)){
                if(st.size() == 0) return false;
                
                char ch2 = st.pop();
                
                if(ch == mp.get(ch2)) continue;
                else return false;
            
            }
            
        }
        
        return (st.size() == 0);
    }
}