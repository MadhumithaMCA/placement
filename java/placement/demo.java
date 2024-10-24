import java.util.*;

class MyException extends Exception {
    public MyException(String a) 
    
    {
        super(a);
    }
}

class student {
    private String name;
    private int cgpa;

    public student(String name, int cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public void checkCgpa() throws MyException {
        if (cgpa < 5) {
            throw new MyException("failed");
        } else {
            System.out.println("passed");
        }
    }
}

public class demo {
    public static void main(String[] args) {
        student stud1 = new student("banu",9);
        student stud2 = new student("sree", 4);
        try {
            stud1.checkCgpa();
        } catch (MyException e) {
            System.out.println(e);
        }
        try {
            stud2.checkCgpa();
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}