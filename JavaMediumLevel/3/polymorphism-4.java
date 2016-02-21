import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class A {
    public String show(D obj) {
        return ("A and D");
    }

    public String show(A obj) {
        return ("A and A");
    } 

}

class B extends A{
    public String show(B obj){
        return ("B and B");
    }
    
    public String show(A obj){
        return ("B and A");
    } 
}

class C extends B{

}

class D extends B{

}

class Solution {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        
        System.out.println("1--" + a1.show(b));
        //1--A and A。找不到A.show(B)，就找A.show(A)去了。

        System.out.println("2--" + a1.show(c));
        //2--A and A。找不到A.show(C)，也找不到A.show(B)，就找A.show(A)去了。

        System.out.println("3--" + a1.show(d));
        //3--A and D。找到A.show(D)。

        System.out.println("4--" + a2.show(b));
        //4--B and A。this是A。找不到A.show(B)。A也没有super。就找A.show(B的super)，也就是A.show(A)。但是A.show(A)，在B中被重写了。所以需要调用B.show(A)。
        
        System.out.println("5--" + a2.show(c));
        //5--B and A。this是A。找不到A.show(C)。A也没有super。就找A.show(C的super)，也就是A.show(B或者A)。先找A.show(B)，没找到。就找A.show(A)。但是A.show(A)，在B中重写了，所以需要调用B.show(A)。
        
        System.out.println("6--" + a2.show(d));
        //6--A and D。this是A。找到A.show(D)。
        
        System.out.println("7--" + b.show(b));
        //7--B and B。this是B。找到B.show(B)。
        
        System.out.println("8--" + b.show(c));
        //8--B and B。this是B。找不到B.show(C)。就找B的super.show(C)，也就是A.show(C)，找不到。就找B.show(C的super)。先找B.show(B)。找到了。
        
        System.out.println("9--" + b.show(d));
        //9--A and D。this是B。找不到B.show(D)。就找B的super.show(C)，也就是A.show(D)，找到了。
    }
}
