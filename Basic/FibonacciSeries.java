import java.util.Scanner;
public class FibonacciSeries {

    public static int fibonacciSeries(int n){
        if(n<=1){
            return n;
        }

        return fibonacciSeries(n-1)+fibonacciSeries(n-2);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        System.out.println(fibonacciSeries(n));
    }
}
