import java.util.Scanner;
public class GreatestThreeeNumber {

    public static void greaterNumber(int a, int b, int c){
        if(a>b){
            if(a>c){
                System.out.println(a+" is greater Number");
            }
            else{
                System.out.println(c+" is greater Number");
            }
        }
        else{
            if(b>c){
                System.out.println(b+" is greater Number");
            }
            else{
                System.out.println(c+" is greater Number");
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

        greaterNumber(num1, num2, num3);
    }
}
