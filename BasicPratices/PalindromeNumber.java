import java.util.Scanner;
public class PalindromeNumber{

    public static boolean palindromeNumber(int n){
        int rem;
        int reverse=0;
        int check=n;

        while(n>0){
            rem=n%10;
            reverse=(reverse*10)+rem;
            n=n/10;
        }

        if(check==reverse){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        System.out.println("Palindrome or not:- "+palindromeNumber(n));
    }
}