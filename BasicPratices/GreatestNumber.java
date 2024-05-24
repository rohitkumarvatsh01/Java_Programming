import java.util.Scanner;
public class GreatestNumber{
    public static void greatestNumber(int n1, int n2){
        if(n1>n2){
            System.out.println("Number1 is Greater:- "+n1);
        }else{
            System.out.println("Number2 is Greater:- "+n2);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the Number2:- ");
        int num2=sc.nextInt();

        greatestNumber(num1, num2);
    }
}