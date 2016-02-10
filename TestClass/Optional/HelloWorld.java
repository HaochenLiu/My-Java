public class HelloWorld
{
    public static void main(String args[]){
        AutoBicycle a1 = new AutoBicycle(1, 2, 3, 4);
        a1.showStatus();

        AutoBicycle a2 = new AutoBicycle(10);
        a2.showStatus();
    }
}
