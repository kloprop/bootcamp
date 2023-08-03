package OOPDaily.SportsEvent;

public class Main {
  public static void main(String[] args) {
    Tennis sp = new Tennis();
    sp.start();
    Tennis te = null;
    
    if (sp instanceof Tennis){
       te = (Tennis) sp;
    }
    te.start();
  }
}
