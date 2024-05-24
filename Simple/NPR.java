import java.util.Scanner;

public class NPR{

    public static int findFact(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        return fact;
    }

    public static int npr(int n, int r){
        return (findFact(n)/findFact(n-r));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of N:- ");
        int n=sc.nextInt();

        System.out.println("Enter the value of R:- ");
        int r=sc.nextInt();

        System.out.println(npr(n,r));


    }
}