import java.util.Scanner;

public class Lsearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the number of elements:");
        int num = sc.nextInt();

        int arr[] = new int[num];

        // Input the elements of the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the number to search
        System.out.println("Enter the number to search:");
        int n = sc.nextInt();

        boolean found = false;
        int position = -1;

      
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                found = true;
                position = i;
                break; 
            }
        }


        if (found) {
            System.out.println("The element found at index: " + position);
        } else {
            System.out.println("The element not found");
        }


    }
}
