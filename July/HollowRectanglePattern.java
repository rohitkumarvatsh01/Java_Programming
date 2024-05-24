import java.util.Scanner;
public class HollowRectanglePattern{

    public static void pattern(int row, int col){
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

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Number:- ");
        int m=sc.nextInt();

        pattern(n, m);
    }
}