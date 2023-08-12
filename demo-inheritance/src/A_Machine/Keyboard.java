import java.util.Objects;

public class Keyboard {
  private String buttonType;
  private int noOfButton;


  public Keyboard(String buttonType, int noOfButton) {
    this.buttonType = buttonType;
    this.noOfButton = noOfButton;
  }

  public String getButtonType() {
    return this.buttonType;
  }

  public void setButtonType(String buttonType) {
    this.buttonType = buttonType;
  }

  public int getNoOfButton() {
    return this.getNoOfButton();
  }

  public void setNoOfButton(int noOfButton) {
    this.noOfButton = noOfButton;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof Keyboard)) {
      return false;
    }
    Keyboard keyboard = (Keyboard) obj;
    return Objects.equals(keyboard.buttonType, this.buttonType)
        && Objects.equals(keyboard.noOfButton, this.noOfButton);
  }
}
