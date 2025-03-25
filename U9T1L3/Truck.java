package U9T1L3;

public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }

    @Override
    public void printInfo() {
      super.printInfo();
      System.out.println("NUmber of axles: " + axles);
      System.out.println("Trailer: " + hasTrailer);
    }

    public boolean validateLicensePlate() {
      if (hasTrailer) {
        String string = getLicensePlate().substring(getLicensePlate().length() - 2);
        return ((string.equals("MX") && axles > 4)) || (string.equals("LX") && axles <= 4);
      }
      return true;
    }

    @Override
    public double calculateTollPrice() {
      double toll = getTollFee() * axles;
      if (hasTrailer) {
        return toll * 2;
      }
      return toll;
    }
  }