import java.util.Scanner;
public class SwapNumber {

    public static void swapTemp(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("num1 is:- "+a);
        System.out.println("num2 is:- "+b);
    }

    public static void swapWithout(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("num1 is:- "+a);
        System.out.println("num2 is:- "+b);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the num1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the num2:- ");
        int num2=sc.nextInt();

        swapTemp(num1, num2);
        swapWithout(num1, num2);
    }
}
