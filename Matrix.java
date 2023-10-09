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

        int[][] matrixA = new int[arow][acol];
        System.out.println("Enter Elements for Matrix A : ");
        inputm(sc, matrixA);

        int[][] matrixB=new int[brow][bcol];
        System.out.println("Enter Elements for Matrix B : ");
        inputm(sc, matrixB);

        int[][] resultm=multiplym(matrixA, matrixB);

        System.out.println("Product Matrix of Matrix A : ");
        displaym(matrixA);
        System.out.println("And Matrix B : ");
        displaym(matrixB);
        System.out.println("Is : ");
        displaym(resultm);
        

    }
    
    private static void inputm(Scanner sc, int[][] matrix){
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print("Enter Element at position ("+i+","+j+")");
                matrix[i][j]=sc.nextInt();

            }
        }
    }
    private static int[][] multiplym(int[][] A,int[][] B){
        int arow=A.length;
        int acol=A[0].length;
        int bcol=B[0].length;

        int[][] resultm = new int[arow][bcol];
        for (int i=0;i<arow;i++){
            for (int j=0;j<bcol;j++){
                for(int k=0;k<acol;k++){
                    resultm[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        return resultm;
    }

    public static void displaym(int[][] A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}