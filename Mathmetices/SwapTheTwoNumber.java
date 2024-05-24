import java.util.Scanner;
public class SwapTheTwoNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the num1:- ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int temp;
        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("After Swapping Number:- ");
        System.out.println(num1+" "+num2);
    }
}