public class Matrix{
    private int row,column;

    private int[][] matrix;

    public Matrix(){
        row = 0;
        column = 0;
        matrix = new int[row][column];
    }

    public Matrix(int rows, int columns){
        row = rows;
        column = columns;
        matrix = new int[row][column];
    }

    public void fillWith(int[] values){
        int rowNumber = 0;
        int colNumber = 0;
        int valueCounter = 0;
        while(valueCounter < values.length){
            matrix[rowNumber][colNumber] = values[valueCounter++];
            colNumber++;
            if(colNumber == column){
                rowNumber++;
                colNumber = 0;
            }
        }
    }

    private boolean isInSameOrder(Matrix matrix_to_add){
        return this.row == matrix_to_add.row && this.column == matrix_to_add.column;
    }

    public Matrix add(Matrix matrix_to_add){
        if(!isInSameOrder(matrix_to_add)) return new Matrix();
        Matrix resultingMatrix = new Matrix(row,column);
        for(int i = 0; i < row; i++)
            for(int j = 0; j < column; j++)
                resultingMatrix.matrix[i][j] = matrix[i][j] + matrix_to_add.matrix[i][j];
        return resultingMatrix;
    }

    private boolean isValueAt(int row,int column,int value){
        return this.matrix[row][column] == value;
    }

    public boolean isEqualTo(int[] expectedMatrix){
        int rowNumber = 0;
        int colNumber = 0;
        int valueCounter = 0;
        while(valueCounter < expectedMatrix.length){
            if(! this.isValueAt(rowNumber,colNumber,expectedMatrix[valueCounter++])) return false;
            colNumber++;
            if(colNumber >= column){
                rowNumber++;
                colNumber = 0;
            }
        }
        return true;
    }

    private boolean isValidPosition(int row, int column){
        return (row < this.row) && (column < this.column);
    }

    public void changeElementAt(int row,int column, int value){
        if(this.isValidPosition(row,column))
            this.matrix[row][column] = value;
    }
}
