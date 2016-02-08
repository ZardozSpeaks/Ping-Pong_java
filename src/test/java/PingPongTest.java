import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class PingPongTest {

  @Test
  public void makeArr_forUserInput_returnsArray() {
    PingPong PingPongTest = new PingPong();
    ArrayList<Integer> countArr = new ArrayList<Integer>();
    countArr.add(1);
    countArr.add(2);
    assertEquals(countArr, PingPongTest.makeArr(2));
  }
}
