import java.util.Scanner;

public class matrixadd {

    public static void main(String[] args) {
        
        Scanner a=new Scanner(System.in);
        
        System.out.println("enter the number of rows");
        int rows = a.nextInt();
        System.out.println("enter the number of columns");
        int cols = a.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result  = new int[rows][cols];

        System.out.println("enter the elements for matrix 1");

        for(int i=0;i<rows;i++){
           for(int j=0;j<cols;j++){
           matrix1[i][j] = a.nextInt();

           }
        }

        System.out.println("enter the elements for matrix 2");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix2[i][j] = a.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result[i][j]= matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("the result of matrix is");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(result[i][j]+ "");
            }
           
        }

    
}
}
