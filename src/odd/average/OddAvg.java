package odd.average;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddAvg {
  public static void main(String[] args) {
    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases
    List<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 9, 8, 6, 11));

    System.out.println(oddAverage(input));

  }

  public static float oddAverage(List<Integer> inputList) {
    float result = 0f;
    List<Integer> oddList = new ArrayList<Integer>();
    for (int i = 0; i < inputList.size(); i++) {
      if (inputList.get(i) % 2 != 0) {
        oddList.add(inputList.get(i));
      }
    }
    float sum = 0;
    for (int i = 0; i < oddList.size(); i++) {
      sum += oddList.get(i);
      System.out.println(oddList.get(i));
    }
    result =  sum / oddList.size();
    return result;
  }
}
