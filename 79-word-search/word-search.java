class Solution {

    public static boolean dfs(char[][] board, String word, int i, int j, int row, int col, int wordPoint, int[][] visited){
        if(wordPoint == word.length()) return true;
        if(i < 0 || j <0 || i>= row || j>= col || visited[i][j] == 1 || board[i][j]!=word.charAt(wordPoint)) return false;
        visited[i][j] = 1;
        boolean found = (dfs(board, word, i+1, j, row, col, wordPoint+1,visited)||
                        dfs(board, word, i-1, j, row, col, wordPoint+1,visited)||
                        dfs(board, word, i, j+1, row, col, wordPoint+1,visited)||
                        dfs(board, word, i, j-1, row, col, wordPoint+1,visited));
        if(found!=true) visited[i][j] = 0;
        return found;
    }

    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        int visited[][] = new int[row][col];

        boolean found = false;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(dfs(board, word, i, j, row, col, 0,visited)) return true;
            }    
        }

        return false;
    
    }
}