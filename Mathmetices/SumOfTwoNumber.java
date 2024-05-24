import java.util.Scanner;

public class SumOfTwoNumber{

    public static int sumOfTwoNumber(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the number2:- ");
        int num2=sc.nextInt();

        int ans=sumOfTwoNumber(num1, num2);
        System.out.println("The Sum of Two number is:- "+ans);
    }
}