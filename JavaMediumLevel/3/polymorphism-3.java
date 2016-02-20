import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Wine {  
    private String name;  

    public String getName() {  
        return name;  
    }  

    public void setName(String name) {  
        this.name = name;  
    }  

    public Wine(){  
    }  

    public String drink(){  
        return "喝的是 " + getName();  
    }  

    /** 
     * 重写toString() 
     */  
    public String toString(){  
        return null;  
    }  
}  
  
class JNC extends Wine{  
    public JNC(){  
        setName("JNC");  
    }  
      
    /** 
     * 重写父类方法，实现多态 
     */  
    public String drink(){  
        return "喝的是 " + getName();  
    }  
      
    /** 
     * 重写toString() 
     */  
    public String toString(){  
        return "Wine : " + getName();  
    }  
}  
  
class JGJ extends Wine{  
    public JGJ(){  
        setName("JGJ");  
    }  
      
    /** 
     * 重写父类方法，实现多态 
     */  
    public String drink(){  
        return "喝的是 " + getName();  
    }  
      
    /** 
     * 重写toString() 
     */  
    public String toString(){  
        return "Wine : " + getName();  
    }  
}  

class Solution {
    public static void main(String[] args) {
        //定义父类数组  
        Wine[] wines = new Wine[2];  
        //定义两个子类  
        wines[0] = new JNC();  
        wines[1] = new JGJ();  
          
        for(int i = 0 ; i < 2 ; i++){  
            System.out.println(wines[i].toString() + "--" + wines[i].drink());  
        }  
        System.out.println("-------------------------------");  
    }
}
