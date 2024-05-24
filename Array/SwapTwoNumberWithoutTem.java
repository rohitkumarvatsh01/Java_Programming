import java.util.Scanner;
public class SwapTwoNumberWithoutTem{

    public static void swapTwoNumber(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.print(a+" "+b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Num1:-");
        int num1=sc.nextInt();

        System.out.println("Enter the value of Num2:- ");
        int num2=sc.nextInt();

        
        System.out.println("The Swap of two number is:- ");
        swapTwoNumber(num1, num2);

    }
}
