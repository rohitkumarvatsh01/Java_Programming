import java.util.Scanner;
public class CountDigits{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        int count=0;
        int rem;

        while(num>0){
            rem=num%10;
            count++;
            num=num/10;
        }

        System.out.println("The Count of Number Digits:- "+ count);
    }
}