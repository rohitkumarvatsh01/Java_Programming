import java.util.Scanner;
public class AdditionArray {

    public static int sumArray(int[][] arr, int row, int col){
        int sum=0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the row:- ");
        int row=sc.nextInt();

        System.out.println("Enter the col:- ");
        int col=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[][] arr=new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Sum:- "+ sumArray(arr, row, col));
    }
}
