package black.jack;

/**
 * Created by HP on 4/18/2017.
 */
public class Card {
  String color;
  int value;

  public Card() {

  }

  public Card(int value, String color) {
    this.value = value;
    this.color = color;
    getInfo();
  }

  public String getInfo() {
    return this.value + " " + this.color;
  }
}

