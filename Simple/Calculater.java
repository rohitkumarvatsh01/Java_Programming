import java.util.Scanner;

public class Calculater{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Opeartor:- ");
        char op=sc.next().charAt(0);
        

        System.out.println("Enter the Num1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the num2:- ");
        int num2=sc.nextInt();

        switch(op){
            case '+':
            int add=num1+num2;
            System.out.println("Addition:- "+ add);
            break;

            case '-':
            int sub=num1-num2;
            System.out.println("Subtraction:- "+ sub);
            break;

            case '*':
            int mul=num1*num2;
            System.out.println("Multiplication:- "+ mul);
            break;

            case '/':
            int div=num1/num2;
            System.out.println("Division:- "+ div);
            break;

            default:
            System.out.println("Invalid Operator");
        }
    }
}