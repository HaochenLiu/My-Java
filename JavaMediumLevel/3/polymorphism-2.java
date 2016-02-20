import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Wine {
  public void fun1(){
    System.out.println("Wine 的 Fun1.....");
    fun2();
  }

  public void fun2(){
    System.out.println("Wine 的 Fun2...");
  }
}

class JNC extends Wine{
  public void fun1(){
    System.out.println("JNC 的 Fun1...");
    fun2();
  }

  public void fun2(){
    System.out.println("JNC 的 Fun2...");
  }
}

class Solution {
  public static void main(String[] args) {
    Wine a = new JNC();
    a.fun1();
  }
}
