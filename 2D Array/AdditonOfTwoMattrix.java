import java.util.Scanner;
public class AdditonOfTwoMattrix {
    
    //print 2D array
    public static void printArray(int[][] arr){

        System.out.println("Array output:- ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    //Sum of 2D array
    public static void sumArray(int[][] arr, int r1, int c1, int[][] brr, int r2, int c2){

        if(r1!=r2 || c1!=c2){
            System.out.println("Invalid Dimension");
            return;
        }

        int[][] sum=new int[r1][c2];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                sum[i][j]=arr[i][j]+brr[i][j];
            }
        }

        printArray(sum);
    }
    
    //Main function
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Matrix 1:- ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();

        int[][] arr=new int[r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the value of Matrix 2:- ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();

        int[][] brr=new int[r1][c1];
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        sumArray(arr, r1, c1, brr, r2, c2);
    }
}
