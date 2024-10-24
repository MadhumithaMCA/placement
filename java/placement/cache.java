import java.io.*;
import java.util.*;

class cache{

    public static void main(String[] args) {

    try{

        System.out.println("divide by 0");
        int a= 5/0;
    }
    catch(ArithmeticException e){

        System.out.println(e);
    }
    finally{

        System.out.println("the number cannot be divisible by 0");
    }


    }
}
