import java.util.regex.*;
class Solution {
    public boolean isMatch(String s, String p) {
        p = p.replace(".","[a-z]");
        p = "^"+p+'$';
        Pattern pt = Pattern.compile(p);
        Matcher m = pt.matcher(s);
        return m.find();
    }
}