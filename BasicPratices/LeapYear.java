import java.util.Scanner;
public class LeapYear{

    public static void leapYear(int n){
        if(n%400==0 && n%100==0 || n%4==0 && n%100!=0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the year:- ");
        int n=sc.nextInt();

        leapYear(n);
    }
}