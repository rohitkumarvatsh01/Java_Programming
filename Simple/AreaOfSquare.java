import java.util.Scanner;

public class AreaOfSquare{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the side of Square:- ");
        int a=sc.nextInt();

        int area=a*a;

        System.out.println("The Area of Square is:- "+ area);
    }
}