import java.util.Scanner;
public class HollowSquare {

    public static void hallowSquare(int row, int col){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i==1 || j==1 || i==row || j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Row:- ");
        int row=sc.nextInt();

        System.out.println("Enter the Column:- ");
        int col=sc.nextInt();

        hallowSquare(row, col);
    }
}
