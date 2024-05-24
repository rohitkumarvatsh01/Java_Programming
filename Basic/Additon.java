import java.util.Scanner;

public class Addition{

    static int sum(int a, int b){
        int add=a+b;

        return add;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a:- ");
        int a=sc.nextInt();

        System.out.println("Enter the value of b:- ");
        int b=sc.nextInt();

        System.out.println("The sum of a+b is:- "+ sum(a,b));
    }
}