class Solution {
    public String retu(String s, int start, int sl,int diff, boolean isTwo){
        StringBuilder sb = new StringBuilder();
        if(!isTwo){
            for(int st = start;st<s.length();st+=diff) sb.append(s.charAt(st));
        }else{
            boolean flag = true;
            for(int st = start;st<s.length();){
                sb.append(s.charAt(st));
                if(flag) {
                    st+=diff;
                    flag = false;
                    }
                else {
                    st+=(sl - diff);
                    flag = true;}
            }
        }
        return sb.toString();
    }
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int sl = 2*(numRows-1);
        int rmng = sl-2;
        for(int i = 0;i<numRows;i++){
            if(i == 0 || i == numRows-1) sb.append(retu(s,i,sl,sl,false));
            else{
                sb.append(retu(s,i,sl,rmng,true));
                rmng-=2;
            }
            System.out.println(sb.toString());
        }
        return sb.toString();
    }
}