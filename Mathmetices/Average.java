import java.util.Scanner;
public class Average{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number:- ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int num4=sc.nextInt();
        int num5=sc.nextInt();

        int sum=num1+num2+num3+num4+num5;
        int avg=sum/5;

        System.out.println("Average of 5 Number is:- "+ avg);
    }
}