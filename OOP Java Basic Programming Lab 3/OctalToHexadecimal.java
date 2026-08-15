package Task3_HW;

import java.util.Scanner;

public class OctalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a octal number : ");
        String octal = sc.nextLine();

        int decimal = Integer.parseInt(octal, 8);
        System.out.println("Equivalent hexadecimal number is: " + Integer.toHexString(decimal).toUpperCase());
        sc.close();
    }
}