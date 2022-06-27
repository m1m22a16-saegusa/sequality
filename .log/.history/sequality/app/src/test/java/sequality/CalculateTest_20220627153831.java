package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAve() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.ave(2, 3, 2), 0.01);
  }

  @Test
  public void testTo() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.to(1, 10));
  }

  @Test
  public void testOdd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.);
  }
}
