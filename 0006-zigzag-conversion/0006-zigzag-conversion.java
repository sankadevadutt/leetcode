class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int index = 2*(numRows-1);
        
        for(int i=0;i<numRows;i++){
            if(i == 0 || i == numRows-1){
                int trav = i;
                while(trav < len){
                    sb.append(s.charAt(trav));
                    trav+=index;
                }
            }else{
                int secondIndex = index- 2*i;
                int trav1 = i;
                int trav2 = i+secondIndex;
                while(trav1<len && trav2<len){
                    sb.append(s.charAt(trav1));
                    sb.append(s.charAt(trav2));
                    trav1+=index;
                    trav2+=index;
                }
                while(trav1<len){
                    sb.append(s.charAt(trav1));
                    trav1+=index;
                }
                while(trav2<len){
                    sb.append(s.charAt(trav2));
                    trav2+=index;
                }
            }
        }
        
        return sb.toString();
        
    }
}