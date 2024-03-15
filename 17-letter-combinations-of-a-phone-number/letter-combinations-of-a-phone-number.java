class Solution {
    public List<String> helper(List<String> list, String curr){
        List<String> ne = new ArrayList<>();
        for(String s : list){
            for(int j = 0;j < curr.length();j++){
                char ch = curr.charAt(j);
                ne.add(s+""+ch);
            }
        }

        return ne;
    }


    public List<String> letterCombinations(String digits) {
        String arr[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ret = new ArrayList<>();
        if(digits.length() == 0) return ret;
        ret.add("");
        for(int i = 0;i<digits.length();i++){
            int dig = Integer.valueOf(digits.charAt(i)-'0');
            ret = helper(ret,arr[dig]);
        }
        return ret;
    }
}