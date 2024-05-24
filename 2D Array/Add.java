import java.util.Scanner;

public class Add {

    public static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void addMatrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        int ans[][]=new int[r2][c2];

        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                ans[i][j]=a[i][j]+b[i][j];
            }
        }

        printArray(ans);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the matrix1:- ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();

        int[][] a=new int[r1][c1];
        System.out.println("Enter the element of Matrix1:- ");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the matrix2:- ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();

        int[][] b=new int[r1][c1];
        System.out.println("Enter the element of Matrix2:- ");
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("The Matrix addition is:- ");
        addMatrix(a, r1, c1, b, r2, c2);
    }
}
