package U9T1L3;

public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;
    
    public Vehicle(String licensePlate, double tollFee, int passengers) {
      this.licensePlate = licensePlate;
      this.tollFee = tollFee;
      this.passengers = passengers;
    }
  
    public String getLicensePlate() {
      return licensePlate;
    }
  
    public double getTollFee() {
      return tollFee;
    }
  
    public int getPassengers() {
      return passengers;
    }
  
    public double calculateTollPrice() {
      return tollFee * passengers;
    }

    public void setPassengers(int newP) {
      passengers = newP;
    }

    public void setTollFee (double newV) {
      tollFee = newV;
    }

    public void printInfo() {
      System.out.println("License plate: " + licensePlate);
      System.out.println("Toll fee: " + tollFee);
      System.out.println("Passengers: " + passengers);
    }

    public void pickupMethod() {
      System.out.println("Use a ridesharing app like Lyft or Uber");
    }
  }