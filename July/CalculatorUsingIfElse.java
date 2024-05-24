import java.util.Scanner;
public class CalculatorUsingIfElse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Operator:- ");
        char ch=sc.next().charAt(0);

        System.out.println("Enter the Number1:- ");
        int a=sc.nextInt();

        System.out.println("Enter the Number2:- ");
        int b=sc.nextInt();

        if(ch=='+'){
            int ans=a+b;
            System.out.println("Addition:- "+ans);
        }
        else if(ch=='-'){
            int ans=a-b;
            System.out.println("Substraction:- "+ans);
        }
        else if(ch=='*'){
            int ans=a*b;
            System.out.println("Multiplication:- "+ans);
        }
        else if(ch=='/'){
            int ans=a/b;
            System.out.println("Division:- "+ans);
        }
    }
}
