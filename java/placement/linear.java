import java.util.*;
public class linear { 
    public static void main(String[] args) 
    {
        int i;
        int flag=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for( i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element :");
        int m=sc.nextInt();
        for(i=0;i<arr.length;i++){
            if(m == arr[i])
            {
                flag=1;
                 break;
            }
            
            
        }
        if(flag==0){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found "+i);
        }

    }    
}