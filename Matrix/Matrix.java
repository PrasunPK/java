public class Matrix{
    private int row,column;

    private int[][] matrix;

    public static Matrix createMatrix(int rows,int columns, int []values){
        Matrix newMatrix = new Matrix(rows,columns);
        newMatrix.fillWith(values);
        return newMatrix;
    }

    private Matrix(){
        row = 0;
        column = 0;
        matrix = new int[row][column];
    }

    private Matrix(int rows, int columns){
        row = rows;
        column = columns;
        matrix = new int[row][column];
    }

    private void fillWith(int[] values){
        int rowNumber = 0;
        int colNumber = 0;
        int valueCounter = 0;
        while(valueCounter < values.length){
            this.putElementAt(rowNumber,colNumber,values[valueCounter++]);
            colNumber++;
            if(colNumber == column){
                rowNumber++;
                colNumber = 0;
            }
        }
    }

    private boolean isValidPosition(int row, int column){
        return (row < this.row) && (column < this.column);
    }

    private void putElementAt(int row,int column, int value){
        if(this.isValidPosition(row,column))
        this.matrix[row][column] = value;
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

    private boolean isMultiplicable(Matrix matrix_to_multiply){
        return this.row == matrix_to_multiply.column && this.column == matrix_to_multiply.row ;
    }

    public Matrix multiply(Matrix matrix_to_multiply){
        if(!this.isMultiplicable(matrix_to_multiply)) return new Matrix();
        Matrix resultingMatrix = new Matrix(this.row,matrix_to_multiply.column);
        int sum = 0;
        for (int i = 0; i < this.row; i++){
            for (int j = 0; j < matrix_to_multiply.column; j++) {
                for(int k = 0; k < this.column; k++)
                    sum += this.matrix[i][k]*matrix_to_multiply.matrix[k][j];
                resultingMatrix.putElementAt(i,j,sum);
                sum = 0;
            }
        }
        return resultingMatrix;
    }
}
