import java.util.Scanner;
public class ReverseNumber{

    public static int reverseNumber(int num){
        int rem;
        int reverse=0;

        while(num>0){
            rem=num%10;
            reverse=(reverse*10)+rem;
            num=num/10;
        }
        return reverse;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        int ans=reverseNumber(n);
        System.out.println(ans);
    }
}