import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MatrixTest{
    @Test
    public void add_2_by_2_matrices(){
        int []first_matrix = {1,2,3,4};
        Matrix matrix = Matrix.createMatrix(2,2,first_matrix);

        int []second_matrix = {1,2,3,4};
        Matrix matrix_to_add = Matrix.createMatrix(2,2,second_matrix);

        Matrix actual = matrix.add(matrix_to_add);
        int []expected = {2,4,6,8};

        assertTrue(actual.isEqualTo(expected));
    }

    @Test
    public void add_3_by_3_matrices(){
        int []first_matrix = {1,2,3,4,5,6,7,8,9};
        Matrix matrix = Matrix.createMatrix(3,3,first_matrix);

        int []second_matrix = {9,8,7,6,5,4,3,2,1};
        Matrix matrix_to_add = Matrix.createMatrix(3,3,second_matrix);

        Matrix actual = matrix.add(matrix_to_add);

        int []expected = {10,10,10,10,10,10,10,10,10};

        assertTrue(actual.isEqualTo(expected));
    }

    @Test
    public void add_2_by_2_matrices_with_positive_and_negative_values(){
        int []first_matrix = {1,-2,3,-4};
        Matrix matrix = Matrix.createMatrix(3,3,first_matrix);

        int []second_matrix = {5,3,-7,11};
        Matrix matrix_to_add = Matrix.createMatrix(3,3,second_matrix);

        Matrix actual = matrix.add(matrix_to_add);

        int []expected = {6,1,-4,7};
        assertTrue(actual.isEqualTo(expected));
    }


    @Test
    public void add_two_different_order_matrices(){
        int []first_matrix = {1,2,3,4};
        Matrix matrix = Matrix.createMatrix(3,3,first_matrix);

        int []second_matrix = {4,3,2,2,3,4};
        Matrix matrix_to_add = Matrix.createMatrix(3,3,second_matrix);

        Matrix actual = matrix.add(matrix_to_add);

        int []expected = {};
        assertTrue(actual.isEqualTo(expected));
    }

    @Test
    public void multiply_multiplies_two_2_by_2_matrices(){
        int []first_matrix = {1,2,3,4};
        Matrix matrix = Matrix.createMatrix(2,2,first_matrix);

        int []second_matrix = {1,2,3,4};
        Matrix matrix_to_multiply = Matrix.createMatrix(2,2,second_matrix);

        Matrix actual = matrix.multiply(matrix_to_multiply);

        int []expected = {7,10,15,22};
        assertTrue(actual.isEqualTo(expected));
    }

    @Test
    public void multiply_multiplies_two_3_by_3_matrices(){
        int []first_matrix = {1,2,3,4,6,7,5,2,1};
        Matrix matrix = Matrix.createMatrix(3,3,first_matrix);

        int []second_matrix = {2,3,1,6,4,2,7,3,1};
        Matrix matrix_to_multiply = Matrix.createMatrix(3,3,second_matrix);

        Matrix actual = matrix.multiply(matrix_to_multiply);

        int []expected = {35,20,8,93,57,23,29,26,10};
        assertTrue(actual.isEqualTo(expected));
    }

}
