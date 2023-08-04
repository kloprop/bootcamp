public enum OrderStatus {
  
  ORDERED,
  PAID,
  SHIPPED,
  COMPLETE,
  ;

  public boolean isForward(OrderStatus status){
    return status.ordinal() > this.ordinal();
  }

  public static void main (String [] args){
    System.out.println(OrderStatus.ORDERED.isForward(OrderStatus.PAID));
  }
}
