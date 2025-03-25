package U9T1L3;

public class Taxi extends Car{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Total fare collected: " + fareCollected);
    }

    public void pickupRiders(int riders, double fare) {
        setPassengers(riders + getPassengers());
        fareCollected += riders * fare;
        if (getPassengers() >= 4 && !isDiscountApplied()) {
            setTollFee(getTollFee() * 0.5);
            setDiscountApplied(true);
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        fareCollected += (getPassengers() - 1) * farePerRider;
        return dropOffPassengers(getPassengers() - 1);
    }

    @Override
    public void pickupMethod() {
        System.out.println("Hail a taxi from the street");
    }
}
