import java.util.Scanner;

public class SumOfDigit{

    public static int sumOfDigit(int num){
        int sum=0;
        int rem;

        while(num>0){
            rem=num%10;
            sum+=rem;
            num=num/10;
        }

        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        System.out.println("The sum of digit:- "+sumOfDigit(num));
    }
}
