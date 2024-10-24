import java.io.*;
import java.util.*;


public class strvowel {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string");
        String str = sc.nextLine();

        str= str.toLowerCase();

        int vowelCount =0;

        for(int i=0; i<str.length();i++){

         char ch= str.charAt(i);
         if(ch == 'a' || ch == 'e'|| ch == 'i' || ch =='o' || ch =='u'){

            vowelCount++;
         }

        }
        System.out.println("number of vowels" + vowelCount);

    }
}
