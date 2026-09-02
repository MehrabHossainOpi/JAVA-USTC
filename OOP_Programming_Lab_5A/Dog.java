package OOP_Programming_Lab_5A;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public static void main(String[] args) {
        Dog d1 = new Dog("Rex", "German Shepherd");
        Dog d2 = new Dog("Max", "Labrador");

        System.out.println(d1.getName() + " " + d1.getBreed());
        System.out.println(d2.getName() + " " + d2.getBreed());

        d1.setName("Rocky");
        d1.setBreed("Bulldog");
        d2.setName("Charlie");
        d2.setBreed("Poodle");

        System.out.println(d1.getName() + " " + d1.getBreed());
        System.out.println(d2.getName() + " " + d2.getBreed());
    }
}
