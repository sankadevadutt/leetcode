import java.util.regex.*;
class Solution {
    public boolean isMatch(String s, String p) {
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<p.length();i++){
            if(p.charAt(i) == '*'){
                boolean b = (sb.toString().charAt(sb.length()-1)!='*');
                if(b) sb.append('*');
                System.out.println(b);
            } 
            else sb.append(p.charAt(i));
        }
        p = sb.toString();
        p = p.replace(".","[a-z]");
        Pattern pt = Pattern.compile(p);
        Matcher match = pt.matcher(s);
        return match.matches();


    }
}