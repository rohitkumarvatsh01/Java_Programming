import java.util.Scanner;
public class CountDigit{

    public static int countDigit(int n){
        int count=0;
        int rem;
        while(n>0){
            rem=n%10;
            count++;
            n/=10;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        System.out.println("Count of Digit:- "+countDigit(n));
    }
}