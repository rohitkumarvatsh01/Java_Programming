import java.util.Scanner;

public class ReverseNumber{

    public static void reverseNumber(int num){
        int rem;
        int reverse=0;

        while(num>0){
            rem=num%10;
            reverse=(reverse*10)+rem;
            num=num/10;
        }

        System.out.println(reverse);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        reverseNumber(num);
    }
}