import java.util.Scanner;
public class CountDigit{

    public static int countDigit(int num){
        int count=0;
        int rem;

        while(num>0){
            rem=num%10;
            count++;
            num=num/10;
        }

        return count;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        System.out.println("The Count of Digits:- "+countDigit(num));
    }
}