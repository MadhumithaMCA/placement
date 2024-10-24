import java.util.Scanner;

public class bubble {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num;
        int n = sc.nextInt();
        
    }


    public static void bubblesort(int[]arr){

         int n= arr.length;
         for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
         }
         for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
         }

    }
}
   

