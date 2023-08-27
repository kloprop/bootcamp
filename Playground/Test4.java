package Playground;

import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Random;

public class Test4 {
  public static int num = 1;

  public Test4() {
    num++;
  }

  public static void main(String[] args) {
  

    PriorityQueue<Integer> queue = new PriorityQueue<>();

    int ran = new Random().nextInt(3) + 2;
    System.out.println(ran);

  }
}

