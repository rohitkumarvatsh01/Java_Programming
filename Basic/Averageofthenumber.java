import java.util.Scanner;

public class  Averageofthenumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of number 1:- ");
        int num1=sc.nextInt();

        System.out.println("Enter the value of number 2:- ");
        int num2=sc.nextInt();

        System.out.println("Enter the value of number 3");
        int num3=sc.nextInt();

        int avg=(num1+num2+num3)/3;

        System.out.println("The average of three number are:- " + avg);

    }
}