import java.util.Scanner;
public class SumDigit{

    public static int sumDigit(int num){
        int sum=0;
        int rem;
        while(num>0){
            rem=num%10;
            sum+=rem;
            num=num/10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        int ans=sumDigit(n);
        System.out.print(ans);
    }
}