package Task3_HW;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Decimal Number : ");
        int decimal = sc.nextInt();

        System.out.println("Binary number is: " + Integer.toBinaryString(decimal));
        sc.close();
    }
}