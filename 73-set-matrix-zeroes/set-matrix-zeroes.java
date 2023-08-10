class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> column = new ArrayList<>();
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    column.add(j);
                }

            }
        }
        for(int i : row){
            for(int j = 0;j<matrix[0].length;j++) matrix[i][j] = 0;
        }

        for(int i : column){
            for(int j = 0;j<matrix.length;j++) matrix[j][i] = 0;
        }
    }
}