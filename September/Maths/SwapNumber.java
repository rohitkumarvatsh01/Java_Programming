import java.util.Scanner;
public class SwapNumber {

    public static void swapNumberTemp(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println(a+" "+b);
    }

    public static void swapNumberWithoutTemp(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a+" "+b);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Value of Number1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the value of Number2:- ");
        int num2=sc.nextInt();

        swapNumberTemp(num1, num2);
        swapNumberWithoutTemp(num1, num2);       
    }
}
