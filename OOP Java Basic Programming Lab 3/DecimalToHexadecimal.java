package Task3_HW;

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int decimal = sc.nextInt();

        System.out.println("Hexadecimal number is : " + Integer.toHexString(decimal).toUpperCase());
        sc.close();
    }
}