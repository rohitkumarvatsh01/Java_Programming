import java.util.Scanner;
public class CalculatorUsingIfElse{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Operator Number:- ");
        System.out.println("1-> Addition 2-> Substraction 3-> Multipilication 4-> Division");
        int op=sc.nextInt();

        System.out.println("Enter the num1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the num2:- ");
        int num2=sc.nextInt();

        int result;

        if(op==1){
            result=num1+num2;
            System.out.println("Addition of num1 and num2:- "+result);
        }
        else if(op==2){
            result=num1-num2;
            System.out.println("Substarction of num1 and num2:- "+result);
        }
        else if(op==3){
            result=num1*num2;
            System.out.println("Multipilication of num1 and num2:- "+result);
        }
        else if(op==4){
            result=num1/num2;
            System.out.println("Division of num1 and num2:- "+result);
        }
        else{
            System.out.println("Please try again, Enter the Operator:- ");
        }
    }
}
