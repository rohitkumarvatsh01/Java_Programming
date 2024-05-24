import java.util.Scanner;
public class GreatestTwoNumber{

    public static void greatestNumber(int num1, int num2){
        if(num1>num2){
            System.out.println("Number1 is Greater");
        }
        else{
            System.out.println("Number2 is Greater");
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