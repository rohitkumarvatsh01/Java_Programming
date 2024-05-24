import java.util.Scanner;
public class TransposeMatrixTemp {

    public static void printMatrix(int[][] matrix){
        System.out.println("Matrix output:- ");

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int[][] matrix, int r, int c){

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                int temp;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        printMatrix(matrix);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the matrix:- ");
        int r=sc.nextInt();
        int c=sc.nextInt();

        System.out.println("Enter the element of matrix:- ");
        int[][] matrix=new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        transposeMatrix(matrix, r, c);
        
    }
}
