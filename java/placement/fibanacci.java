import java.io.*;
import java.util.*;

public class fibanacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int num;
       num=sc.nextInt();

       int num1=0;
       int num2=1;
      
       System.out.print(num1 + " " + num2);

       for (int i=0;i<num;i++)
       {
        int num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
       }
                
          
    }
    
}
