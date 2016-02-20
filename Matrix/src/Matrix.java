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

    private boolean isInSameOrder(Matrix matrix_to_check){
        return this.row == matrix_to_check.row && this.column == matrix_to_check.column;
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
        for (int i = 0; i < this.row; i++)
            for (int j = 0; j < matrix_to_multiply.column; j++) {
                for(int k = 0; k < this.column; k++)
                    sum += this.matrix[i][k]*matrix_to_multiply.matrix[k][j];
                resultingMatrix.putElementAt(i,j,sum);
                sum = 0;
            }
        return resultingMatrix;
    }

    public int determinant(){
        if(!this.isSquare()) return 0;
        return getDeterminant(this.matrix,0);
    }

    private boolean isSquare(){
        return this.row == this.column;
    }

    private int determinantOfTwoByTwo(int [][]matrix){
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    private int [][] getCoefficentMatrix(int [][]original, int index){
        int rows = original.length-1;
        int cols = original.length-1;
        int [][]newMatrix = new int[rows][cols];
        for (int i = 1; i < original.length; i++ ) {
            for(int j = 0; j < original.length; j++ ){
                if(index < j)
                    newMatrix[i-1][j-1] = original[i][j];
                if(index > j)
                    newMatrix[i-1][j] = original[i][j];
            }
        }
        return newMatrix;
    }

    private int sign(int index){
        if(index%2==0) return 1;
        return -1;
    }

    private int getDeterminant(int [][] matrix,int determinant){
        if(matrix.length == 1) return matrix[0][0];
        if(matrix.length == 2) return determinantOfTwoByTwo(matrix);
        int signed = -1;
        for(int i = 0; i < matrix.length; i++){
            int [][] coefficentMatrix = getCoefficentMatrix(matrix,i);
            determinant += sign(i) * matrix[0][i] * getDeterminant(coefficentMatrix,determinant);
        }
        return (determinant);
    }

}
