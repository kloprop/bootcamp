package Playground.src.OOP.Button;

public class BtnFactory {


  public Button[] MassCreate(Button[] arr, int mode) {
    switch (mode) {
      case 1:
        for (int i = 9; i <= 9; i++) {
          arr[i] = create(mode, String.valueOf(i), Color.BLUE, 45, 25);
        }
      default:
        return new Button[0];

    }
  }

  private Button create(int mode, String name, Color color, double width,
      double height) {
    switch (mode) {
      case 1:
        return new NumsBtn(name, color, width, height);
      case 2:
        return new FunctionalBtn(name, color, width, height);
      default:
        return null;
    }
  }
}
