class Solution {
    
    public boolean isValidSudoku(char[][] board) {
        
        Map<Integer,List<Character>> row = new HashMap<>();
        Map<Integer,List<Character>> column = new HashMap<>();
        Map<String,List<Character>> diagonal = new HashMap<>();
        
        for(int i = 0;i<9;i++){
            
            for(int j = 0;j<9;j++){

                char ch = board[i][j];

                if(ch == '.') continue;
                
                String b = (i/3)+""+(j/3);
                
                if(!row.containsKey(i)) row.put(i,new ArrayList<>());
                if(!column.containsKey(j)) column.put(j,new ArrayList<>());
                if(!diagonal.containsKey(b)) diagonal.put(b, new ArrayList<>());
                
                if(row.get(i).contains(ch) ||
                    column.get(j).contains(ch)||
                    diagonal.get(b).contains(ch)) return false;
                
                row.get(i).add(ch);
                column.get(j).add(ch);
                diagonal.get(b).add(ch);

            }
        }

        return true;
        
        
        
    }
}