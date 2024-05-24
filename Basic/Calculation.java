import java.util.Scanner;

public class Calculation{

    static int sum(int a, int b){
        return a+b;
    }

    static int sub(int a, int b){
        return a-b;
    }

    static int mul(int a, int b){
        return a*b;
    }

    static int div(int a, int b){
        return a/b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a:- ");
        int a=sc.nextInt();

        System.out.println("Enter the value of b:- ");
        int b=sc.nextInt();

        System.out.println("The sum of a and b is:- "+ sum(a, b));

        System.out.println("The sub of a and b is:- "+ sub(a, b));

        System.out.println("The mul of a and b is:- "+ mul(a, b));

        System.out.println("The div of a and b is:- "+ div(a, b));


    }
}