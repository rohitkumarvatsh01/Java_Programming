import java.util.Scanner;
public class CalculatorUsingSwitchCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Operator:- ");
        char op=sc.next().charAt(0);

        System.out.println("Enter the Number1:- ");
        int a=sc.nextInt();

        System.out.println("Enter the Number2:- ");
        int b=sc.nextInt();

        int ans;

        switch(op){
            case '+':
            ans=a+b;
            System.out.println("Addition:- "+ans);
            break;

            case '-':
            ans=a-b;
            System.out.println("Substraction:- "+ans);
            break;

            case '*':
            ans=a*b;
            System.out.println("Multiplication:- "+ans);
            break;

            case '/':
            ans=a/b;
            System.out.println("Division:- "+ans);
            break;

            default:
            System.out.println("Invalid Operator, Please enter again");
        }
    }
}
