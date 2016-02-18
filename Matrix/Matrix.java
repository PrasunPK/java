public class Matrix{
    private int row,column;

    private int[][] matrix;

    public Matrix(){
        row = 0;
        column = 0;
    }

    public Matrix(int rows, int columns){
        row = rows;
        column = columns;
        matrix = new int[row][column];
    }

    public void fill(int[][] values){
        for(int i = 0; i < row; i++)
            for(int j = 0; j < column; j++)
                matrix[i][j] = values[i][j];
    }

    private boolean isInSameOrder(Matrix matrix_to_add){
        return this.row == matrix_to_add.row && this.column == matrix_to_add.column;
    }

    public Matrix add(Matrix matrix_to_add){
        if(!isInSameOrder(matrix_to_add))
            return new Matrix(0,0);
        Matrix resultingMatrix = new Matrix(row,column);
        for(int i = 0; i < row; i++)
            for(int j = 0; j < column; j++)
                resultingMatrix.matrix[i][j] = matrix[i][j] + matrix_to_add.matrix[i][j];
        return resultingMatrix;
    }

    public int[][] getMatrix(){
        return this.matrix;
    }
}
