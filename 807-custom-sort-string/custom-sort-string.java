class Solution {
    public String customSortString(String order, String s) {
        List<Integer> seen = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<order.length();i++)
        {
            char ch = order.charAt(i);
            int ind = s.indexOf(ch);
            while(ind!=-1){
                if(seen.contains(ind)) ind = s.indexOf(ch, ind+1);
                else{
                    sb.append(ch);
                    seen.add(ind);
                }

            }
        }

        for(int i = 0; i< s.length();i++){
            if(!seen.contains(i)) sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}