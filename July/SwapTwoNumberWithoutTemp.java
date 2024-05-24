import java.util.Scanner;
public class SwapTwoNumberWithoutTemp {

    public static void swapTwoNumberWithoutTemp(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Number1 is:- "+a);
        System.out.println("Number2 is:- "+b);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Number1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the Value of Number2:- ");
        int num2=sc.nextInt();

        swapTwoNumberWithoutTemp(num1, num2);
    }
}
