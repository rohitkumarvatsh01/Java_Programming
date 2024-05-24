import java.util.Scanner;

public class ReverseDigit{

    public static int reverseDigit(int num){

        int reverse=0;
        int rem;

        while(num>0){
            rem=num%10;
            reverse=(reverse*10)+rem;
            num=num/10;
        }

        return reverse;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        System.out.println("The Digit is:- "+num);
        System.out.println("Reverse of Digit is:- "+reverseDigit(num));

    }
}