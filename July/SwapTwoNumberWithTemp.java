import java.util.Scanner;
public class SwapTwoNumberWithTemp {

    public static void swapTwoNumberWithTemp(int num1, int num2){
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("Number 1 is:- "+num1);
        System.out.println("Number 2 is:- "+num2);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Number1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the Value of Number2:- ");
        int num2=sc.nextInt();

        swapTwoNumberWithTemp(num1, num2);
    }
}
