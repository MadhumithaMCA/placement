import java.io.*;
import java.util.*;

class SumMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = num; i > 0; i--) {
            sum += i;
        }

        System.out.println("Sum of numbers from " + num + " to 1: " + sum);

        int reversed = 0, temp = sum;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        System.out.println("Reversed sum: " + reversed);

        int result = sum * reversed;

        System.out.println("Product of sum and its reverse: " + result);

        if (result == num) {
            System.out.println("This is a magic number.");
        } else {
            System.out.println("This is not a magic number.");
        }
    }
}
