import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

abstract class Animal {  
    public abstract void cry();  
}  
  
class Cat extends Animal{  
  
    @Override  
    public void cry() {  
        System.out.println("猫叫：喵喵...");  
    }  
}  
  
class Dog extends Animal{  
  
    @Override  
    public void cry() {  
        System.out.println("狗叫：汪汪...");  
    }  
    
}  

class Solution {
    public static void main(String[] args) {
        Animal a1 = new Cat();  
        Animal a2 = new Dog();  
          
        a1.cry();  
        a2.cry();  
    }
}
