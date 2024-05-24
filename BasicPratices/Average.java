import java.util.Scanner;
public class Average{

    public static int average(int n1, int n2, int n3, int n4, int n5){
        int avg=0;
        int ans=1;
        avg=n1+n2+n3+n4+n5;
        ans=avg/5;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the num1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the num2:- ");
        int num2=sc.nextInt();

        System.out.println("Enter the num3:- ");
        int num3=sc.nextInt();

        System.out.println("Enter the num4:- ");
        int num4=sc.nextInt();

        System.out.println("Enter the num5:- ");
        int num5=sc.nextInt();

        System.out.println("The Average is:- "+average(num1, num2, num3, num4, num5));

    }
}