class Solution {
    
    public List<String> lc(String []ch, List<String> lt){
        List<String> temp = new ArrayList<>();
        for(String ch1 : lt){
            for(String ch2 : ch){
                temp.add(ch1+""+ch2);
            }
        }
        
        return temp;
        
    }
    
    public List<String> letterCombinations(String digits) {
        
        String []str = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> lt = new ArrayList<>();
        
        if(digits.length() == 0) return lt;
            
        lt.add("");
        for( int i = 0 ; i < digits.length() ; i++ ){    
            int ind = Integer.valueOf(digits.charAt(i)-'0');
            String []ch = str[ind-1].split("");
            lt = lc(ch,lt);
        }
        
        return lt;
        
    }
}