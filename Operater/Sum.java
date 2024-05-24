import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Value of Number1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the Value of Number2:- ");
        int num2=sc.nextInt();

        int sum;
        sum=num1+num2;

        System.out.println("The Sum of Number1 and Number2:- "+ sum);

    }
}