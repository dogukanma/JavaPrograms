import org.junit.Test;
import static org.junit.Assert.*;

public class HigherTest {
  @Test
  public void tc001_positiveNumbers() {
    int result = Higher.higher(50, 200);
    assertEquals(200, result);
  }
}
