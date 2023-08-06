package FoodOrdering;

public class Kitchen {

  Dish cook(int qu, int itemNo) {
    switch (itemNo) {
      case 1:
        return new ChickenCurry(qu);
      case 2:
        return new TraditionalPasta(qu);
      case 3:
        return new Beer(qu);
      default:
        return null;

    }
  }
}
