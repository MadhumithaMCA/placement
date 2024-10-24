import java.io.*;
import java.util.*;


class factorial {
    
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int number,fact=1;
     number = sc.nextInt();

     for (int i=number;i>0;i--)
      {
        fact = fact*i;
      }
      System.out.println("the factorial of a number is:"+fact);
    }
}
