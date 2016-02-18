public class Matrix{
    private int row,column;

    private int[][] matrix;

    private int[][] resultingMatrix;

    public Matrix(){
        row = 0;
        column = 0;
        resultingMatrix  = new int[row][column];
    }

    public Matrix(int rows, int columns){
        row = rows;
        column = columns;
        matrix = new int[row][column];
        resultingMatrix  = new int[row][column];
    }

    public void fill(int[][] values){
        for(int i = 0; i < row; i++)
            for(int j = 0; j < column; j++)
                matrix[i][j] = values[i][j];
    }

    public Matrix add(Matrix matrix_to_add){
        for(int i = 0; i < row; i++)
            for(int j = 0; j < column; j++){
                resultingMatrix[i][j] = matrix[i][j] + matrix_to_add.matrix[i][j];
            }
        return this;
    }

    public int[][] getMatrix(){
        return resultingMatrix;
    }
}
