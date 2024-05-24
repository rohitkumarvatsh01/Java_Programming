import java.util.Scanner;

public class Add{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of A:- ");
        int a=sc.nextInt();

        System.out.println("Enter the value of B:- ");
        int b=sc.nextInt();

        int sum=a+b;

        System.out.println("The sum of "+ a +" and "+ b +" = " + sum);

        
    }
}