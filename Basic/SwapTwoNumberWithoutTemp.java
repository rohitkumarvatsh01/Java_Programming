import java.util.Scanner;

public class SwapTwoNumberWithoutTemp{
    static void swapTwoNumberWithoutTemp(int a, int b){

        System.out.println("The value of A before swap:- "+a);
        System.out.println("The value of B before swap:- "+b);
        
        // a=1 b=2
        // a=a+b 1+2=3 a=3
        // b=a-b 3-1=2 b=2
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("The value of A after swap:- "+a);
        System.out.println("The value of B after swap:- "+b);


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of A:- ");
        int a=sc.nextInt();

        System.out.println("Enter the value of B:- ");
        int b=sc.nextInt();

        swapTwoNumberWithoutTemp(a,b);


    }
}