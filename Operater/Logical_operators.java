import java.util.Scanner;

public class Logical_operators{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Value of Number1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the Value of Number2:- ");
        int num2=sc.nextInt();

        System.out.println("Enter the value of Number3:- ");
        int num3=sc.nextInt();
        
        //Logical AND
        System.out.println((num1 > num2) && (num2 > num3));
        System.out.println((num1 < num2) && (num2 < num3));

        //Logical OR
        System.out.println((num1>num2) || (num2>num3));
        System.out.println((num1<num2) || (num2<num3));

        //Logical NOT
        System.out.println(!(num1==num2));
        System.out.println(!(num1<num2));

        
    }
}