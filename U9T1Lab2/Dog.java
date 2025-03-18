package U9T1Lab2;

public class Dog extends Animal{
    private Boolean petted = false;

    public Dog(String name, int age, Boolean vaccinated) {
        super(name, age, vaccinated);
    }
    
    public Boolean getPetted() {
        return petted;
    }
    
    public void walk() {
        System.out.println(getName() + " has been walked");
    }

    public void pet() {
        System.out.println(getName() + " has been petted");
        petted = true;
    }
}
