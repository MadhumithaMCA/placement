import java.io.*;
import java.util.*;

class division {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();

        if(num%3==0 && num%5==0){

            System.out.println("the number is divisible by 3 and 5");
        }else{

            System.out.println("the number is not divisible by 3 and 5");
        }
    
    }
}