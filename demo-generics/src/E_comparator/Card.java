package E_comparator;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Card extends Paper {
  int number;

  public Card (int number,int size){
    super(size);
    this.number = number;
  }

  @Override
  public String toString(){
    return this.number + " "+this.size+", ";
  }

  public static void main(String[] args) {
    List <Card> cards = Arrays.asList(new Card(1,2),new Card(4,3));
    Collections.sort(cards,new SortByNumber());
    System.out.println(cards);

    List <? extends Number> numbers = new ArrayList<Integer>();
    numbers = new ArrayList<Double>();
  

    //List<Number> numbers = new ArrayList<Integer>(); // no polymorhism, not allow to inherit

    Number number = new Integer(10); // polymorhism
  }
}
