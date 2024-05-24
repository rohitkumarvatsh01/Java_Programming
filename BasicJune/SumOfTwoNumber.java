import java.util.Scanner;
public class SumOfTwoNumber{

    public static int sum(int a, int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the Number2:- ");
        int num2=sc.nextInt();

        System.out.println("Sum of Two Number:- "+sum(num1, num2));
    }
}