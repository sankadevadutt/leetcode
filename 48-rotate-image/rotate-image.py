class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        ROWS, COLS = len(matrix), len(matrix[0])

        for row in range(ROWS):
            for col in range(row+1,COLS):
                matrix[row][col], matrix[col][row] = matrix[col][row],matrix[row][col]
        
        for row in range(ROWS):
            for col in range(COLS//2):
                matrix[row][col], matrix[row][COLS-col-1] = matrix[row][COLS-col-1],matrix[row][col]
