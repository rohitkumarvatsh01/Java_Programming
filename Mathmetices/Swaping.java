import java.util.Scanner;
public class Swaping{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number:- ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("After Swapping:- ");
        System.out.println(num1+" "+num2);
    }
}