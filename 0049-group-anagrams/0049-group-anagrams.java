class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map <String, List<String>> mp = new HashMap<>();
        
        for(String str : strs){
            
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            
            String s2 = new String(ch);
            
            if(!mp.containsKey(s2)) mp.put(s2, new ArrayList<>());
            
            mp.get(s2).add(str);
            
        }
        
        List<List<String>> ans = new ArrayList<>();
        
        for(List<String> s : mp.values()) ans.add(s);
        
        
        return ans;
        
    }
}