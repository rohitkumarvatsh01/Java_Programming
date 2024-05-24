import java.util.Scanner;
public class Arithmetic_operators{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Number1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the value of Number2:- ");
        int num2=sc.nextInt();

        //Addition
        int sum=num1+num2;

        //Substration
        int sub=num1-num2;

        //Multiply
        int mul=num1*num2;

        //Division
        int div=num1/num2;

        System.out.println("The value of the Addition:- " + sum);
        System.out.println("The value of Substration:- " + sub);
        System.out.println("The value of Multiplication:- " + mul);
        System.out.println("The value of Division:- " + div);

    }
}