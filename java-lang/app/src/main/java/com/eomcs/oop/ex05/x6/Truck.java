package com.eomcs.oop.ex05.x6;

public class Truck extends Car {
  int weight;

  @Override
  public void run() {
    System.out.println("덜컹덜컹 달린다!");
  }

  public void dump() {
    System.out.println("짐 내린다!");
  }
}
