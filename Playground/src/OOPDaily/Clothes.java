

public class Clothes {
  private String color;
  private int price;
  private String pattern;
  private int frontLength;
  private int chestWidth;
  private static final String[] patterns =
      new String[] {"plain", "dotted", "checked"};
  private static final String[] colors = new String[] {"Red", "Green", "Blue"};
  private char size;

  private Clothes(String color, char size) {
    this.color = color;
    this.price = 500;
    this.size = size;
    sizeChart(size);
    this.pattern = "plain";
  }

  public static Clothes of(String color, char size) {
    return new Clothes(color, size);
  }


  private void sizeChart(char size) {
    if (size == 'L') {
      this.frontLength = 70;
      this.chestWidth = 56;
    } else if (size == 'M') {
      this.frontLength = 68;
      this.chestWidth = 53;
    } else {
      this.frontLength = 63;
      this.chestWidth = 49;
    }
  }

  public String getPattern() {
    return pattern;
  }

  public Clothes setPattern(String pattern) {
    if (checkValid(patterns, pattern)) {
      this.pattern = pattern;
    } else {
      System.out.println("Invalid pattern");
    }
    return this;
  }

  public String getColor() {
    return this.color;
  }

  public Clothes setColor(String color) {
    if (checkValid(colors, color)) {
      this.color = color;
    } else {
      System.out.println("Invalid color");
    }
    return this;
  }

  public void display() {
    System.out.printf("Size:%s   Color:%s   Pattern:%s   Price:%d\n", this.size,
        this.color, this.pattern, this.price);
  }

  public boolean checkValid(String[] arr, String element) {
    for (String str : arr) {
      if (str.equals(element))
        return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Clothes c = Clothes.of("Red", 'M');
    c.setColor("Green").setPattern("dotted").display();
    char cg = '9';
    System.out.println(cg%2);
  }
} 
