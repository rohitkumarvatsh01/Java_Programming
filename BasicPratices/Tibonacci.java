import java.util.Scanner;
public class Tibonacci{

    public static void tibonacci(int n){
        int a=0;
        int b=1;
        int c=2;
        int d;

        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        tibonacci(n);
    }
}