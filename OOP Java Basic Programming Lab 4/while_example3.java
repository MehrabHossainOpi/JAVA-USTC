package java_examples;
public class while_example3 {
    public static void main(String[] args) {
        int i = 10;

        while (i < 5) {
            System.out.println("This will never be printed");
            i++;
        }

        System.out.println("Loop finished.");
    }
}
