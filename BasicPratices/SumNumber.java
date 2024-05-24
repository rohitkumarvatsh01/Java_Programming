import java.util.Scanner;
public class SumNumber{

    public static int sumNumber(int n){
        int sum=0;
        int rem;

        while(n>0){
            rem=n%10;
            sum+=rem;
            n=n/10;
        }

        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        System.out.println("Sum of Digit is:- "+sumNumber(n));
    }
}