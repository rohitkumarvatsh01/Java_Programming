import java.util.Scanner;

class TuranaryOperator{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Value of A:- ");
        int a=sc.nextInt();

        System.out.println("Enter the Value of B:- ");
        int b=sc.nextInt();

        System.out.println("Enter the Value of C:- ");
        int c=sc.nextInt();


        int ans;
        ans=(a>b)?(a>c?a:c):(b>c?b:c);

        System.out.println("The Greater Number in A B and C is:- " + ans);


    }
}