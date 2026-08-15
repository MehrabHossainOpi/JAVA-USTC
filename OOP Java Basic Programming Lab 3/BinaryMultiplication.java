package Task3_HW;

import java.util.Scanner;

public class BinaryMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first binary number: ");
        String bin1 = sc.nextLine();
        System.out.print("Input the second binary number: ");
        String bin2 = sc.nextLine();

        int dec1 = Integer.parseInt(bin1, 2);
        int dec2 = Integer.parseInt(bin2, 2);
        int product = dec1 * dec2;

        System.out.println("Product of two binary numbers: " + Integer.toBinaryString(product));
        sc.close();
    }
}