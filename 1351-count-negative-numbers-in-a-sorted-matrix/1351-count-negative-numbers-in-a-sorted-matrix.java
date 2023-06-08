class Solution {
    public int countNegatives(int[][] grid) {
        
        
        int size = grid[0].length ;
        
        int left = 0, right = size;
        
        
        while(left < right){
            
            int mid = left + (right - left)/2;
            
            if(grid[0][mid] >= 0){
                
                left = mid + 1;
            }else{
                left = mid;
                break;
            }
        }
        
        while(left > 0 && grid[0][left-1] < 0) left--;
        
        int ind = left;
        
        int count = (size - left);
        
        for(int i = 1 ; i < grid.length ; i++ ){
            
            
            while(ind > 0 && grid[i][ind-1] < 0 ) ind--;
            
            count += (size - ind) ;
                        
        }
        
        
        return count;
        
    }
}