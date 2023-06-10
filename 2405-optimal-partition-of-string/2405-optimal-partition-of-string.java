class Solution {
    public int partitionString(String s) {
        
        int count = 0;
        
        int left = 0, right = s.length() ; 
        
        while( left < right ) {
            
            List<Character> lt = new ArrayList<>();
            
            while(left < right && !lt.contains(s.charAt(left))){
                
                lt.add(s.charAt(left));
                left ++;
            }
            
            count ++;
            
            
        }
        
        return count;
        
    }
}