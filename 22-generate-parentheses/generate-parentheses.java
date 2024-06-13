class Solution {
    
    public List<String> generateParenthesis(int n) {
        Set<String> ret = new HashSet<>();
        ret.add("()");
        ret = helper(2, ret, n);
        return new ArrayList<>(ret);
    
    }

    public Set<String> helper(int n, Set<String> ret, int give)
    {
        if(n == give+1){
            return ret;
        }
        Set<String> temp = new HashSet<>();
        for(String st : ret){
            temp.add("()" + st);
            temp.add(st+"()");
            // temp.add('('+st+')');
            int ind = st.indexOf(')');
            while(ind!=-1){
                temp.add(st.substring(0,ind)+"()"+st.substring(ind));
                ind = st.indexOf(')',ind+1); 
            }
        }
        System.out.println(n+" : "+temp);
        return helper(n+1,temp,give);
    }
}