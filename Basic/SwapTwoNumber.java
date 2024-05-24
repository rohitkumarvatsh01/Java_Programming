import java.util.Scanner;

public class SwapTwoNumber{
    static void swapTwoNumber(int a, int b){

        System.out.println("The value of A before Swap:- "+ a);
        System.out.println("The value of B before swap:- "+ b);

        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("The Value of A after swap:- "+ a);
        System.out.println("The value of B after swap:- "+ b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of A:- ");
        int a=sc.nextInt();

        System.out.println("Enter the value of B:- ");
        int b=sc.nextInt();

        swapTwoNumber(a, b);
    }
}