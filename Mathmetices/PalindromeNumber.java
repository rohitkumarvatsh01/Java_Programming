import java.util.Scanner;

public class PalindromeNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the NUmber:- ");
        int num=sc.nextInt();

        int check=num;
        int reverse=0;
        int rem;

        while(num>0){
            rem=num%10;
            reverse=(reverse*10)+rem;
            num=num/10;
        }

        if(check==reverse){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
    }
}