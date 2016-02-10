import java.util.Optional;

public class AutoBicycle {
    // the Bicycle class has
    // three fields
    public int value;
    public Optional<Bicycle> ob;
        
    // the Bicycle class has
    // one constructor
    public AutoBicycle(int startCadence, int startSpeed, int startGear, int startValue) {
        ob = Optional.of(new Bicycle(startCadence, startSpeed, startGear));
        value = startValue;
    }

    public AutoBicycle(int startValue) {
      ob = Optional.empty();
        value = startValue;
    }

    public void showStatus() {
      if(ob.isPresent()) {
          ob.get().showStatus();
      }
      System.out.println("value = " + value);
    }
}
