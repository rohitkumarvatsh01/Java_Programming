import java.util.Scanner;
public class SwapToNumber{

    public static void swapTwoNumber(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;

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