package Task3_HW;

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Binary Number: ");
        String binary = sc.nextLine();

        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Octal number: " + Integer.toOctalString(decimal));
        sc.close();
    }
}