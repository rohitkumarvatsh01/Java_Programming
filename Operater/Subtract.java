import java.util.Scanner;

public class Subtract{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of Number1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the value of Number2:- ");
        int num2=sc.nextInt();

        int sub=num1-num2;

        System.out.println("The Substraction of number1 and number2:- " + sub);


    }
}