package odd.average;


import java.util.ArrayList;

import java.util.List;

public class OddAvg {

  public float oddAverage(List<Integer> inputList) {
    float result = 0f;
    List<Integer> oddList = new ArrayList<Integer>();
    for (int i = 0; i < inputList.size(); i++) {
      if (inputList.get(i) % 2 != 0) {
        oddList.add(inputList.get(i));
      }
    }
    if (oddList.size() == 0) oddList.add(0);
    float sum = 0;
    for (int i = 0; i < oddList.size(); i++) {
      sum += oddList.get(i);
      System.out.println(oddList.get(i));
    }
    result = sum / oddList.size();
    return result;
  }
}
