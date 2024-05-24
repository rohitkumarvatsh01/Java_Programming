import java.util.Scanner;
public class GreatestNumberThree{

    public static void greatestNumberThree(int a, int b, int c){
        if(a>b){
            if(a>c){
                System.out.println("Number1 is Greater:- "+a);
            }
            else{
                System.out.println("Number3 is Greater:- "+b);
            }
        }
        else{
            if(b>c){
                System.out.println("Number2 is Greater:- "+b);
            }
            else{
                System.out.println("Number3 is Greater:- "+c);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the Number2:- ");
        int num2=sc.nextInt();

        System.out.println("Enter the Number3:- ");
        int num3=sc.nextInt();

        greatestNumberThree(num1, num2, num3);
    }
}