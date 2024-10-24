import java.util.*;


public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element to sort:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("enter the element");
        int a = sc.nextInt();
        int low = 0, high = n - 1, flag = 0;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
        if (a > arr[mid]) {
            low = mid + 1;
        } else if (a < arr[mid]) {
            high = mid - 1;
        } else {
            flag = 1;
            break;
        }
    }
        if (flag == 1) {
            System.out.println("element found");

        } else {
            System.out.println("element not found");
        }
    }

} 
