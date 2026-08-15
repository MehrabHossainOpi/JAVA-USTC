package Task3_HW;

import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        String hex = sc.nextLine();

        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Equivalent decimal number is: " + decimal);
        sc.close();
    }
}