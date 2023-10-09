import java.util.Scanner;

import java.util.*;

public class Matrix{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of Rows of matrix A : ");
        int arow=sc.nextInt();
        System.out.print("Enter the number of Columns of matrix B : ");
        int acol=sc.nextInt();

        System.out.print("Enter the number of ROws of Matrix B : ");
        int brow=sc.nextInt();
        System.out.print("Enter the number of Columns of Matrix B : ");
        int bcol=sc.nextInt();
        
        if (acol!=brow){
            System.out.print("The Matrices cannot be multiplied : ");
            return;
        }

        int[][] matrixA = new int[arow][acol]
        System.out.println("Enter Elements for Matrix A : ");
        Inputm(sc, matrixA);

        

    }
    
    private static void Inputm(Scanner sc, int[][] matrix){
        for (i=0;i<matrix.length;i++){
            for(j=0;j<matrix.length;j++){
                System.out.print("Enter Element at position ("+i+","+j+")");
                matrix[i][j]=sc.nextInt()
            }
        }
    }
}