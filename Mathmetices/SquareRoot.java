import java.util.Scanner;
public class SquareRoot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        double ans=Math.sqrt(n);
        System.out.println("Square Root is:- "+ans);
    }
}