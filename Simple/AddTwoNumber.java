import java.util.Scanner;

public class AddTwoNumber{

    public static int addTwoNumber(int num1, int num2){
        return num1+num2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of A:- ");
        int a=sc.nextInt();

        System.out.println("Enter the value of B:- ");
        int b=sc.nextInt();

        System.out.println("The sum of A and B is:- "+ addTwoNumber(a,b));
    }
}