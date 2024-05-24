import java.util.Scanner;
public class ReverseDigit{

    public static int reverseDigit(int n){
    
        int rem;
        int reverse=0;

        while(n>0){
            rem=n%10;
            reverse=(reverse*10)+rem;
            n=n/10;
        }
        return reverse;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        System.out.println("Reverse of Digit:- "+reverseDigit(n));
    }
}