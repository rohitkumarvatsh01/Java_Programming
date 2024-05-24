import java.util.Scanner;

public class ReverseDigits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        int reminder;
        while(n>0){
            reminder=n%10;
            System.out.print(reminder);
            n=n/10;
        }
    }
}