import java.util.Scanner;
public class ReverseDigit{

    public static void reverseDigit(int num){
        int rem;
        int reverse=0;
        while(num>0){
            rem=num%10;
            System.out.print(rem);
            num=num/10;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        reverseDigit(n);
    }
}