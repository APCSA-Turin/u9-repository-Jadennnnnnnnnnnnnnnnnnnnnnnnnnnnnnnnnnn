package U9T1Lab2;

public class GamingDesktop extends Desktop {
    String gc;

    public GamingDesktop(int screenSize, int memory, String gc) {
        super(screenSize, memory, true);
        this.gc = gc;
    }

    public String getGraphicsCard() {
        return gc;
    }

    public void updateGraphicsCard(String newGC) {
        gc = newGC;
        System.out.println("Graphics card updated");
    }
}