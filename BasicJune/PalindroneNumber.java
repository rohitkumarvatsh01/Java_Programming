import java.util.Scanner;
public class PalindroneNumber{

    public static void palindroneNumber(int n){
        int rem;
        int reverse=0;
        int store=n;

        while(n>0){
            rem=n%10;
            reverse=(reverse*10)+rem;
            n=n/10;
        }

        if(reverse==store){
            System.out.println("Palindrone Number");
        }
        else{
            System.out.println("Not Palindrone Number");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        palindroneNumber(n);
    }
}