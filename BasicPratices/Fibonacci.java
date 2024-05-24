import java.util.Scanner;
public class Fibonacci{
    public static void fibonacci(int n){
        int a=0;
        int b=1;
        int c;

        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        fibonacci(num);
    }
}