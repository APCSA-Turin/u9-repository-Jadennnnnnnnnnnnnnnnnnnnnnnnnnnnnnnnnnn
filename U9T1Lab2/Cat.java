package U9T1Lab2;

public class Cat extends Animal{
    private Boolean declawed;

    public Cat (String name, int age, Boolean vaccinated, Boolean declawed) {
        super(name, age, vaccinated);
        this.declawed = declawed;
    }

    public Boolean getDeclawed() {
        return declawed;
    }

    public void play() {
        System.out.println(getName() + " has been played with");
    }

    public void nap() {
        System.out.println(getName() + " is taking a nap");
    }
}
