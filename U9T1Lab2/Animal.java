package U9T1Lab2;

public class Animal {
    private String name;
    private int age;
    private Boolean vaccinated;
    private Boolean fed = false;

    public Animal (String name, int age, Boolean vaccinated) {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Boolean getVaccinated() {
        return vaccinated;
    }

    public Boolean getFed() {
        return fed;
    }

    public void adopt() {
        System.out.println(name + " has been adopted!");
    }

    public void feed() {
        System.out.println(name + " has been fed");
        fed = true;
    }

    public void shower() {
        System.out.println(name + " has been cleaned");
    }
}
