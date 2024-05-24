import java.util.Scanner;

public class Addthetwonumber{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the First Number:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the Second Numer:- ");
        int num2=sc.nextInt();

        int add=num1+num2;

        System.out.println("The Addition of the Two number is:- "+ add);
    }
}