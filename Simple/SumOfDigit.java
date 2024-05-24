import java.util.Scanner;

public class SumOfDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Digits:- ");
        int n=sc.nextInt();

        int sum=0;
        while(n>0){
            int reminder=n%10;
            sum=sum+reminder;
            n=n/10;
        }

        System.out.println("The Sum of Digits is:- "+ sum);
    }
}