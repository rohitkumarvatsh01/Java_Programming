import java.util.Scanner;
public class GreaterInThreeNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the Number1:- ");
        int num2=sc.nextInt();

        System.out.println("Enter the Number1:- ");
        int num3=sc.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.println(num1);
            }
            else{
                System.out.println(num2);
            }
        }
        else if(num2>num3){
            if(num2>num1){
                System.out.println(num2);
            }
            else{
                System.out.println(num3);
            }
        }
        

    }
}