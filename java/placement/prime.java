import java.io.*;
import java.util.*;

class prime {

    public static void main(String[] args) {
        int num,flag=0;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
    
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0){
    
            System.out.println("it is a prime number");
        }else{
            System.out.println("it is not a prime number");
        }
    }
}





    
    
