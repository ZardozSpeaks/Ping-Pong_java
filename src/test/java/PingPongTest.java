import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class PingPongTest {

  @Test
  public void makeArr_forUserInput_returnsArray() {
    PingPong pingPong = new PingPong();
    assertEquals(new ArrayList<>(Arrays.asList("1", "2")), pingPong.makeArr(2));
  }
  
  @Test
  public void makeArr_forDivisableFifteen_returnsArray() {
    PingPong pingPong = new PingPong();
    assertEquals(new ArrayList<>(Arrays.asList("1", "2", "ping", "4", "pong")), pingPong.makeArr(5));
  }

}
