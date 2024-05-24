import java.util.Scanner;
public class CalculatorUsingSwitchCase{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Operator:- ");
        char ch=sc.next().charAt(0);
        
        System.out.println("Enter the Number1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the Number2:- ");
        int num2=sc.nextInt();

        int ans;

        switch(ch){
            case '+':
                ans=num1+num2;
                System.out.println("Addition:- "+ans);
                break;
            
            case '-':
                ans=num1-num2;
                System.out.println("Substarction:- "+ans);
                break;
            
            case '*':
                ans=num1*num2;
                System.out.println("Multiplication:- "+ans);
                break;

            case '/':
                ans=num1/num2;
                System.out.println("Division:- "+ans);
                break;

            default:
                System.out.println("Enter the Valid Operator");
        }
    }
}