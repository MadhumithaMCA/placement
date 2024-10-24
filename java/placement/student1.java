 import java.io.*;
import java.util.*;

public class student1 {

    String name;
    int rollno;
    String dept;

    
    void display(String name, int rollno, String dept) {
       
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Department: " + dept);
    }
}

class Main {
    public static void main(String[] args) {
       
        student1 sc = new student1();
       
        sc.display("Nitya", 101, "MCA");
    }
}
 
    

