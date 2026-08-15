package Task3_HW;

import java.util.Scanner;

public class HexadecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hexadecimal Number : ");
        String hex = sc.nextLine();

        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Equivalent Binary Number is: " + Integer.toBinaryString(decimal));
        sc.close();
    }
}