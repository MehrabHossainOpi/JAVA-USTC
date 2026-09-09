package OOP_Java_Programming_Lab_6;

public class Cat {

    private String name;
    private int age;

    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.display();
    }
}
