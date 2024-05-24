import java.util.Scanner;

public class Rectuangular{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of row:- ");
        int row=sc.nextInt();

        System.out.println("Enter the Value of column:- ");
        int col=sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}