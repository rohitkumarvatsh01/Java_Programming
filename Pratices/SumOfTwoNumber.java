import java.util.Scanner;

public class SumOfTwoNumber{

    public static int sumOfNumber(int num1, int num2){
        int sum=0;
        sum=num1+num2;
        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Numner1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the Number2:- ");
        int num2=sc.nextInt();

        System.out.println(sumOfNumber(num1, num2));
    }
}