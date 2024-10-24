import java.io.*;
import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       System.out.println("enter the string");
       String str = sc.nextLine();


       int length =  str.length();

       for (int i=0; i<str.length() / 2 ; i++){
           
        if(str.charAt(i) != str.length()-i-1){

            System.out.println("the string is palindrome");

        }else{

            System.out.println("the string is not palindrme");
        }
          
       }

    }
}