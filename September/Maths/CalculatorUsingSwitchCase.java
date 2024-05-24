import java.util.Scanner;
public class CalculatorUsingSwitchCase{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Operator:- ");
        char ch=sc.next().charAt(0);

        System.out.println("Enter the Number1:- ");
        int a=sc.nextInt();

        System.out.println("Enter the Number2:- ");
        int b=sc.nextInt();

        switch(ch){
            case '+':
                int add=a+b;
                System.out.println(add);
                break;
            
            case '-':
                int sub=a-b;
                System.out.println(sub);
                break;

            case '*':
                int mul=a*b;
                System.out.println(mul);
                break;

            case '/':
                int div=a/b;
                System.out.println(div);
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}