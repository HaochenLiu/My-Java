public class AutoBicycle {
    // the Bicycle class has
    // three fields
    public int value;
    public Bicycle b;
        
    // the Bicycle class has
    // one constructor
    public AutoBicycle(int startCadence, int startSpeed, int startGear, int startValue) {
        b = new Bicycle(startCadence, startSpeed, startGear);
        value = startValue;
    }

    public void clear() {
        b = null;
    }

    public void showStatus() {
      if(b != null) {
          b.showStatus();
      }
      System.out.println("value = " + value);
    }
}
