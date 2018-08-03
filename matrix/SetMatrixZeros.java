//Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length; // row
        if (m < 1) {
            return;
        }
        int n = matrix[0].length; // column
        if (n < 1) {
            return;
        }
        boolean firstRow = false, firstCol = false;
        for (int i = 0 ; i < m ; i ++ ) {
            if (matrix[i][0] == 0) {
                firstCol = true;
            }
        }
        for (int j = 0 ; j < n ; j ++ ) {
            if (matrix[0][j] == 0) {
                firstRow = true;
            }
        }
        for (int i = 1 ; i < m ; i ++ ) {
            for (int j = 1 ; j < n ; j ++ ) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // mark the first element in the column
                    matrix[0][j] = 0; // mark the first element in the row
                }
            }
        }
        for (int i = 1 ; i < m ; i ++ ) {
            for (int j = 1 ; j < n ; j ++ ) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (firstCol) {
            for (int i = 0 ; i < m ; i ++ ) {
                matrix[i][0] = 0;
            }
        }
        if (firstRow) {
            for (int j = 0 ; j < n ; j ++ ) {
                matrix[0][j] = 0;
            }
        }
    }
}
