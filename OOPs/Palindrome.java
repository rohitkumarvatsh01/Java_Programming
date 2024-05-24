import java.util.Scanner;

public class Palindrome{

    public static boolean palindrome(int num){
        int rem;
        int chk=num;
        int reverse=0;

        while(num>0){
            rem=num%10;
            reverse=(reverse*10)+rem;
            num=num/10;
        }

        if(chk==reverse){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        System.out.println("Palindrome or not:- "+palindrome(num));
    }
}
