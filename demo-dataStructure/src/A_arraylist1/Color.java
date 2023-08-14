package A_arraylist1;

import java.util.Random;

public enum Color {
  RED(100), //
  BLUE(200), //
  YELLOW(300), //
  ;

  private int score;

  private Color(int score) {
    this.score = score;
  }

  public static Color getRandomColor() {
    int colorCode = new Random().nextInt(3);

    for (Color color : Color.values()) {
      if (color.ordinal() == colorCode) {
        return color;
      }
    }
    return null;
  }

  public int getScore() {
    return this.score;
  }

}
