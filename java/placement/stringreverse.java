import java.io.*;
import java.util.*;

public class stringreverse {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the string");
        String str =  sc.nextLine();

        String revString = new StringBuilder(str).reverse().toString();

        System.out.println("reversed string:" + revString);


    }
}
