class Solution {
    public int myAtoi(String s) {
        
        s = s.strip();
        long ans = 0;
        int ind = 0;
        int len = s.length();
        int sign = 1;
        StringBuilder sb = new StringBuilder();
        while(ind<len){
            if(ind<len && (s.charAt(ind) == '-' || s.charAt(ind) == '+')){
                if(ind<len-1 && !(s.charAt(ind+1)>='0' && s.charAt(ind+1)<='9')) ind = len;
            }
            if(ind<len && s.charAt(ind)>='0' && s.charAt(ind)<='9'){
                if(ind>=1 && s.charAt(ind-1) == '-') sign = -1;
                while(ind<len && (s.charAt(ind)>='0' && s.charAt(ind)<='9')){
                    sb.append(s.charAt(ind));
                    ind++;
                }
                ind = len;
            }
            while(ind<len && (s.charAt(ind) == '-' || s.charAt(ind) == '+')) ind++;
            while(ind<len && !(s.charAt(ind)>='0' && s.charAt(ind)<='9')){
                ind = len;
            }
        }
        try {
            if(sb.length()>0) ans = Long.valueOf(sb.toString());
            else return 0;
        }
        catch(NumberFormatException nfe){
            return (sign == -1)?Integer.MIN_VALUE:Integer.MAX_VALUE;
        }
        ans = ans*sign;
        if(ans>Integer.MAX_VALUE)  ans = Integer.MAX_VALUE;
        else if(ans<Integer.MIN_VALUE) ans = Integer.MIN_VALUE;
        return (int)(ans);


    }
}