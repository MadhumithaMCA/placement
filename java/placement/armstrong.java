import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        int originalNum = num;
        int result = 0;
        int n = 0;
        
        // Calculate the number of digits (n)
        while (originalNum != 0) {
            originalNum /= 10;
            n++;
        }
        
        originalNum = num;
        
        // Calculate the sum of each digit raised to the power of the number of digits
        while (originalNum != 0) {
            int digit = originalNum % 10;
            result += Math.pow(digit, n);
            originalNum /= 10;
        }
        
        // Check if the sum is equal to the original number
        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        
        sc.close();
    }
}
