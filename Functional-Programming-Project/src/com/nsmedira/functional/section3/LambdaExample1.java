package com.nsmedira.functional.section3;

public class LambdaExample1 {

// least concise
//  public static void main(String[] args) {
//
//    MyRunnable runnable = new MyRunnable();
//    Thread t = new Thread(runnable);
//    t.start();
//  }

// more concise
//  public static void main(String[] args) {
//
//    Thread t = new Thread(new Runnable() {
//
//      @Override
//      public void run() {
//        System.out.println("Thread Executed!");
//      }
//    });
//    t.start();
//  }

// a function has 4 properties:
//   1. name of the function
//   2. parameters list
//   3. body of the function
//   4. return type
  public static void main(String[] args) {

    Thread t = new Thread(() -> System.out.println("Thread Executed!"));
    t.start();
  }
}
