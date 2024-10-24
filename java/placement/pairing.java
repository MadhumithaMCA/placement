import java.io.*;
import java.util.Scanner;

public class pairing {

    // Method to calculate the number of ways employees can be single or paired
    static int countWays(int n) {
        // If the number of employees is odd, return 1 (all employees are single)
        if (n % 2 != 0) {
            return 1;
        }

        // dp[i] will store the number of ways to pair up i employees
        int[] dp = new int[n + 1];

        // Base cases
        dp[0] = 1;  // No employees, 1 way (no pairs)
        dp[1] = 1;  // 1 employee, only 1 way (single)

        // Fill the dp array
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of employees
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        // Output the number of ways to pair employees
        System.out.println("Number of ways to pair employees: " + countWays(n));

        sc.close();
    }
}
