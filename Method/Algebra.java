import java.util.Scanner;
public class Algebra{

    //ADDITION
    public int add(int a, int b){
        return a+b;
    }
    //SUBSTRACTION
    public int sub(int a, int b){
        return a-b;
    }
    //MULTIPILICATION
    public int mul(int a, int b){
        return a*b;
    }
    //DIVISION
    public int div(int a, int b){
        return a/b;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Num1:- ");
        int num1=sc.nextInt();
        System.out.println("Enter the value of Num2:- ");
        int num2=sc.nextInt();

        Algebra obj=new Algebra();

        System.out.println("The Add of num1 and num2:- "+ obj.add(num1, num2));
        System.out.println("The Sub of num1 and num2:- "+ obj.sub(num1, num2));
        System.out.println("The Mul of num1 and num2:- "+ obj.mul(num1, num2));
        System.out.println("The Div of num1 and num2:- "+ obj.div(num1, num2));
    }
}