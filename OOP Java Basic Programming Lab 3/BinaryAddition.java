package Task3_HW;

import java.util.Scanner;


public class BinaryAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        String bin1 = sc.nextLine();
        System.out.print("Input second binary number: ");
        String bin2 = sc.nextLine();
        sc.close();

        int dec1 = Integer.parseInt(bin1, 2);
        int dec2 = Integer.parseInt(bin2, 2);
        int sum = dec1 + dec2;

        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(sum));
        
    }
}