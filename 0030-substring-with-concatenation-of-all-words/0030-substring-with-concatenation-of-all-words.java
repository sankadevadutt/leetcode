class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        
        List<Integer> ans = new ArrayList<>();
        List<String> input = Arrays.asList(words);
        Collections.sort(input);
        int len = words.length;
        int size = words[0].length();
        
        int strlen = len*size;
        
        for(int i = 0 ; i <= s.length() - strlen ; i++){
            
            String substr = s.substring(i,i+strlen);
            List<String> cmp = new ArrayList<>();
            for(int j = 0;j<=strlen-size;j+=size){
                cmp.add(substr.substring(j,j+size));
            }
            Collections.sort(cmp);
            if(cmp.equals(input)) ans.add(i);
            
        }
        
        return ans;
        
        
    }
}