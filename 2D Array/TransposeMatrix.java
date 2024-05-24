import java.util.Scanner;

public class TransposeMatrix {

    //Print Matrix
    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    //Transpose matrix
    public static void transposeMatrix(int[][] matrix, int r, int c){

        int[][] ans=new int[c][r];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                ans[i][j]=matrix[j][i];
            }
        }
        printMatrix(ans);
    }

    //Main Function
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Matrix:- ");
        int r=sc.nextInt();
        int c=sc.nextInt();

        System.out.println("Enter the element of Matrix:- ");
        int[][] matrix=new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Transpose Matrix is:- ");
        transposeMatrix(matrix, r, c);
    }
}
