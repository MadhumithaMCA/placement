import java.io.*;
import java.util.*;

public class paranthesis{


    public static void main(String[] args) {

     String input = "((a b c) ((d e))";
     StringBuilder result = new StringBuilder();
     int count = 0;

     
      
     for (char ch : input.toCharArray()) {
        if (ch == '(') {
            if (count == 0 || input.charAt(input.length() - 1) != '(') {
                count++;
            }

        }else if(ch == ')') {
            if (count > 0) {
                count--;
            }
        }else{

            
            result.append(ch);
        }
    }
    System.out.println("the original string is:" + input);
    System.out.println("the modified string is:"+ result);
        
    }
}