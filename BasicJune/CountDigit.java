import java.util.Scanner;
public class CountDigit{

    public static int countDigit(int num){
        int rem;
        int count=0;
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
        int n=sc.nextInt();

        int ans=countDigit(n);
        System.out.println("Count of Number:- "+ans);
    }
}