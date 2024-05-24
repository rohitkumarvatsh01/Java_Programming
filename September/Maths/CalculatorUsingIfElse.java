import java.util.Scanner;
public class CalculatorUsingIfElse{

    public static int calculator(char ch, int a, int b){
        int ans=0;
        if(ch=='+'){
            ans=a+b;
        }
        else if(ch=='-'){
            ans=a-b;
        }
        else if(ch=='*'){
            ans=a*b;
        }
        else if(ch=='/'){
            ans=a/b;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Operator:- ");
        char ch=sc.next().charAt(0);

        System.out.println("Enter the Number1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the Number2:- ");
        int num2=sc.nextInt();

        System.out.println(calculator(ch, num1, num2));
    }
}