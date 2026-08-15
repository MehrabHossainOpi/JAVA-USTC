package Task3_HW;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        int decimal = sc.nextInt();

        System.out.println("Octal number is: " + Integer.toOctalString(decimal));
        sc.close();
    }
}