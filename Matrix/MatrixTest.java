import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MatrixTest{
    @Test
    public void add_two_same_order_matrices(){
        Matrix matrix = new Matrix(2,2);
        int []first_matrix = {1,2,3,4};
        matrix.fillWith(first_matrix);

        Matrix matrix_to_add = new Matrix(2,2);
        int []second_matrix = {4,3,2,1};
        matrix_to_add.fillWith(second_matrix);

        Matrix result = matrix.add(matrix_to_add);

        int []expected = {5,5,5,5};

        assertTrue(result.isEqualTo(expected));
    }

    @Test
    public void add_two_same_order_matrices_with_positive_and_negative_values(){
        Matrix matrix = new Matrix(2,2);
        int []first_matrix = {1,-2,3,-4};
        matrix.fillWith(first_matrix);

        Matrix matrix_to_add = new Matrix(2,2);
        int []second_matrix = {5,3,-7,11};
        matrix_to_add.fillWith(second_matrix);

        Matrix result = matrix.add(matrix_to_add);

        int []expected = {6,1,-4,7};

        assertTrue(result.isEqualTo(expected));
    }

    @Test
    public void add_two_different_order_matrices(){
        Matrix matrix = new Matrix(2,2);
        int []first_matrix = {1,2,3,4};
        matrix.fillWith(first_matrix);

        Matrix matrix_to_add = new Matrix(2,3);
        int []second_matrix = {4,3,2,2,3,4};
        matrix_to_add.fillWith(second_matrix);

        Matrix result = matrix.add(matrix_to_add);

        int []expected = {};

        assertTrue(result.isEqualTo(expected));
    }

    @Test
    public void changeElementAt_changes_the_value_of_given_position_provided_to_it(){
        Matrix matrix = new Matrix(2,2);
        int []first_matrix = {1,2,3,4};
        matrix.fillWith(first_matrix);
        int row = 0, column = 1, value = 5;
        matrix.changeElementAt(row,column,value);

        int []expected = {1,5,3,4};

        assertTrue(matrix.isEqualTo(expected));
    }
}
