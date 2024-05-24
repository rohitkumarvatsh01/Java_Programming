import java.util.Scanner;
public class GreaterNumberInTwo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the Number2:- ");
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println("Number 1 is Greater:- "+num1);
        }
        else if(num1==num2){
            System.out.println("Number 1 and Number 2 is Equal:- "+num1);
        }
        else{
            System.out.println("Number 2 is Greater:- "+num2);
        }
    }
}