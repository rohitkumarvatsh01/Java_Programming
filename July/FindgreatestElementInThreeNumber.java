import java.util.Scanner;
public class FindgreatestElementInThreeNumber {

    public static void greatestElement(int num1, int num2, int num3){
        if(num1>num2){
            if(num1>num3){
                System.out.println("Number1 is Greater");
            }
            else{
                System.out.println("Number2 is Greater");
            }
        }
        else{
            if(num2>num3){
                System.out.println("Number2 is Greater");
            }
            else{
                System.out.println("Number3 is Greater");
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

        greatestElement(num1, num2, num3);
    }
}
