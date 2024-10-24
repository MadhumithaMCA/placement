import java.io.*;
import java.util.*;


public class jump {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");

    int num = sc.nextInt();
    int jump = 0;
    while(num!=0){

    if(num%2==0){
        num =num/2;
        System.out.println(num);
        jump++;
    }
    else{

        num=num-1;
        System.out.println(num);
        jump++;
    }

}
System.out.println("the number of jumps are: " +jump);
}
}

