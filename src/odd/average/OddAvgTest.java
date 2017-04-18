package odd.average;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by HP on 4/18/2017.
 */
class OddAvgTest {
  OddAvg myOddAve;

  @BeforeEach
  void beforeEach() {
    myOddAve = new OddAvg();
  }

  @Test
  void testMixed() {
    List<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 9, 8, 6, 11));
    assertEquals((1+3+5+9+11)/5f, myOddAve.oddAverage(input));
  }

  @Test
  void testJustOdd() {
    List<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 9, 11));
    assertEquals((1+3+5+9+11)/5f, myOddAve.oddAverage(input));
  }

  @Test
  void testJustEven() {
    List<Integer> input = new ArrayList<Integer>(Arrays.asList(2, 4, 8, 10, 6));
    assertEquals(0, myOddAve.oddAverage(input));
  }
}