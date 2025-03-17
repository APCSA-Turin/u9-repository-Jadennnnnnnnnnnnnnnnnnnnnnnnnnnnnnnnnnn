public class Train extends Vehicle{
    private Boolean isElectric;

    public Train(String name, int wheels, Boolean isElectric) {
        super(name, wheels);
        this.isElectric = isElectric;
    }

    public Boolean getIsElectic() {
        return isElectric;
    }

    public void reachStation() {
        System.out.println("This is Atlantic Avenue-Barclays Center. Transfer is available to the B, D, Q, R, 2, 3, 4, and 5 train. Connection is also available to the Long Island Railroad. The next stop is Canal Street. Stand clear the closing doors please.");
    }
}
