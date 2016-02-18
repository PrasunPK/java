import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MatrixTest{
    @Test
    public void add_two_same_order_matrix(){
        Matrix matrix = new Matrix(2,2);
        int []first_matrix = {1,2,3,4};
        matrix.fill(first_matrix);

        Matrix matrix_to_add = new Matrix(2,2);
        int []second_matrix = {4,3,2,1};
        matrix_to_add.fill(second_matrix);

        Matrix result = matrix.add(matrix_to_add);

        int []expected = {5,5,5,5};

        assertTrue(result.isEqualTo(expected));

    }
}
