package D_function;
import java.util.function.Function;
@FunctionalInterface
public interface SuperFunction<T, S, U, R> {
  
  R apply(T t, S s, U u);

  public static void main(String[] args) {
    SuperFunction<Integer,Integer,Integer,Integer> adder = (n,n1,n2) ->n+n1+n2;
  }
}
