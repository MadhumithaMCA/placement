import java.util.Scanner;

public class root {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = sc.nextInt(); 

       
        int sqrt = (int) Math.sqrt(number);

        if (sqrt * sqrt == number) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
            
        sc.close();
    }
    
}