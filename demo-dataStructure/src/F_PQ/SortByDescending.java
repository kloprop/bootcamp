package F_PQ;

import java.util.Comparator;

public class SortByDescending implements Comparator<String>{
  
  @Override
  public int compare(String o1,String o2){
    return o1.charAt(0) > o2.charAt(0)? -1:1;
  }
}
