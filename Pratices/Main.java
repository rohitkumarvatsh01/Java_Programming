import java.util.Scanner;
public class Main{

    public static int countNumber(int n){
        int count=0;
        int rem;
        while(n>0){
            rem=n%10;
            count++;
            n=n/10;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        System.out.println("Count of Digit:- "+countNumber(n));
    }
}