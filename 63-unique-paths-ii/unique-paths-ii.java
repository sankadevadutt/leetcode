class Solution {
    public int helper(int[][] arr, int i, int j,int row, int column, int[][]dp){
        if(i<0 || i>=row || j<0 || j>=column) return 0;
        if(arr[i][j] == 1) return 0;
        if(i == row-1 && j == column-1) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        dp[i][j] = (helper(arr,i+1,j,row,column,dp)+helper(arr,i,j+1,row,column,dp));
        return dp[i][j];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int column = obstacleGrid[0].length;
        int dp[][] = new int[row][column];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++) dp[i][j] = -1;
        }
        return helper(obstacleGrid,0,0,row,column,dp);
    }
}