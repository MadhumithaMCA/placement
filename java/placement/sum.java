import java.io.*;
import java.util.*;

class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int sum = 0;

        
        for (int i = num; i > 0; i--) {
            sum =sum+i;
        }

        System.out.println("Sum of numbers is"+ sum);

    }
}
 



