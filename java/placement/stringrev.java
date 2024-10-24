import java.io.*;
import java.util.*;

public class stringrev {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string");
        String str =sc.nextLine();

        char[] chararray = str.toCharArray();

        int left =0;
        int right = chararray.length -1;

        while(left<right){

            char temp = chararray[left];
            chararray[left] = chararray[right];
            chararray[right] = temp;

            left ++;
            right --;
        }

        String reversedString =  new String(chararray);


        System.out.println("reversed string:"+ reversedString);
    }
    
}