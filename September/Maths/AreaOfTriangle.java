import java.util.Scanner;
public class AreaOfTriangle {

    public static void area(int a, int b, int c){
        int s;
        double area;

        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the side1:- ");
        int a=sc.nextInt();

        System.out.println("Enter the Side2:- ");
        int b=sc.nextInt();

        System.out.println("Enter the Side3:- ");
        int c=sc.nextInt();

        area(a, b, c);
    }
}
