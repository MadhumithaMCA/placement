import java.io.*;
import java.util.*;

public class student {

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
        
        student sc = new student();
        
        sc.display("Nitya", 101, "MCA");
    }
}
