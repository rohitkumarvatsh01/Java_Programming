import java.util.Scanner;
public class CircleArea{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the radius:- ");
        int redius=sc.nextInt();

        double area=(3.14*redius*redius);

        System.out.println("Area of Circle is:- "+area);
    }
}