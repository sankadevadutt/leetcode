class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> mp = new HashMap<>();
        mp.put('(',')');
        mp.put('{','}');
        mp.put('[',']');
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('||ch == '{' || ch == '['){
                st.push(ch);
            }else{
                if(st.empty()) return false;
                char ch2 = st.pop();
                if(ch!=mp.get(ch2)) return false;
            }
        }
        return st.empty();
    }
}