package U9T1L3;

public class VehicleRunner {
    public static void main(String[] args) {
      Taxi ta = new Taxi("TX1234", 10.0, 6, true, 0.0);
      Car c = new Car("TX1234", 10.0, 6, true);
      Truck t = new Truck("TX1234", 10.0, 6, 6, false);
      Vehicle v = new Vehicle("TX1234", 10.0, 6);

      ta.pickupMethod();
      c.pickupMethod();
      t.pickupMethod();
      v.pickupMethod();
    }
}