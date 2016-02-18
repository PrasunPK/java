import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void getResultTest() {
    Calculator c = new Calculator();
    int res = c.getResult();
    assertEquals(0, res);
  }

  @Test
  public void addTest() {
    Calculator c = new Calculator();
    c.add(5).add(5);
    assertEquals(10, c.getResult());
  }
}
