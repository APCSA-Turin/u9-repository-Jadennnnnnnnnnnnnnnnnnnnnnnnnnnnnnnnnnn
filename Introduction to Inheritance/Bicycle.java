public class Bicycle extends Vehicle {
    private int gearCount;

    public Bicycle(int gearCount, String name, int wheels) {
        super(name, wheels);
        this.gearCount = gearCount;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void ringBell() {
        System.out.println("Ring ring ring");
    }
}