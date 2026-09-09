package OOP_Java_Programming_Lab_6;

public class Dog {

    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", "Brown");
        dog.display();
    }
}