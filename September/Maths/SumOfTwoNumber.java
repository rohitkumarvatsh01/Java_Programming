import java.util.Scanner;
public class SumOfTwoNumber{

    public static int sumOfTwoNumber(int num1, int num2){
        int sum=0;
        sum=num1+num2;
        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the Number2:- ");
        int num2=sc.nextInt();

        System.out.println("Sum of Num1 is "+num1+" + Num2 is "+num2+"= "+sumOfTwoNumber(num1, num2));
    }
}