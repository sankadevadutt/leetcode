class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        ROWS, COLS = len(matrix), len(matrix[0])
        zeros = [(row,col) for row in range(ROWS) for col in range(COLS) if matrix[row][col] == 0]

        zeros = set(zeros)

        for r,c in zeros:
            matrix[r] = [0]*COLS
            for i in range(ROWS):
                matrix[i][c] = 0
        