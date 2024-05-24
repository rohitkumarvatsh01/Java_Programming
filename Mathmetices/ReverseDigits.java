import java.util.Scanner;

public class ReverseDigits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        int rem;
        int reverse=0;

        while(num>0){
            rem=num%10;
            reverse=(reverse*10)+rem;
            num/=10;
        }

        System.out.println("Reverse Number is:- "+reverse);
    }
}