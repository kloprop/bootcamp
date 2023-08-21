package C_revision;

public class TestException {

  public static int method(int amount) throws BusinessException {
    if (amount < 10) {
      return amount;
    }
    throw new BusinessException("Error : Amount larger than 10");
  }

  public static int method2(int amount) throws AbcException {
    if (amount < 10) {
      return amount;
    }
    throw new AbcException("Error : Abc error");
  }

  public static void main(String[] args) throws BusinessException {
    try {
      int i = TestException.method(10);
    } catch (BusinessException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Finally");
    }
    TestException.method2(10);



  }
}
