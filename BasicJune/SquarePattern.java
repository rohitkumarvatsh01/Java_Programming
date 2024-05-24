import java.util.Scanner;
public class SquarePattern{

    public static void squarePattern(int row, int col){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Row:- ");
        int row=sc.nextInt();

        System.out.println("Enter the Coloum:- ");
        int col=sc.nextInt();

        squarePattern(row, col);
    }
}