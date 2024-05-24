import java.util.Scanner;

public class HollowCountRectuangular {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Rows:- ");
        int row=sc.nextInt();

        System.out.println("Enter the value of Cols:- ");
        int col=sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i==1 || j==1 || i==row || j==col){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
