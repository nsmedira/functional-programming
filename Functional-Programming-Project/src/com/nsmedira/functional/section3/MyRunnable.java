package com.nsmedira.functional.section3;

// Two ways to create a Stream in Java:
//   1. Implementing Runnable Interface
//   2. Extending the Thread Class
public class MyRunnable implements Runnable{

  @Override
  public void run() {
    System.out.println("Thread Executed");
  }

}
