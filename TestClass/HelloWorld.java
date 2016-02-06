public class HelloWorld {
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        Bicycle b = new Bicycle(0, 1, 2);
        b.showStatus();
        b.cadence = 100;
        b.showStatus();
        changeSomething(b);
        b.showStatus();
    }
    
    public static void changeSomething(Bicycle b) {
        b.cadence = 200;
    }
}
