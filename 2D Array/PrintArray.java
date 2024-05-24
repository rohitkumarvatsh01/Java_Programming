import java.util.Scanner;
public class PrintArray {
    public static void printArray(int[][] arr){
        System.out.println("The 2D Array:- ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the row:- ");
        int row=sc.nextInt();

        System.out.println("Enter the col:- ");
        int col=sc.nextInt();

        System.out.println("Enter the element in 2D:- ");
        int[][] arr=new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printArray(arr); 
    }
}
