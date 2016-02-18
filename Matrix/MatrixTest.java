import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class MatrixTest{
    @Test
    public void add(){
        Matrix matrix = new Matrix(2,2);
        int [][]first_matrix = {{1,2},
                                {3,4}};
        matrix.fill(first_matrix);

        Matrix matrix_to_add = new Matrix(2,2);
        int [][]second_matrix = {{4,3},
                                 {2,1}};
        matrix_to_add.fill(second_matrix);

        Matrix expected = matrix.add(matrix_to_add);
        int [][]actual = {{5,5},
                          {5,5}};

        assertArrayEquals("The arrays are not same ", expected.getMatrix(), actual);

    }
}
