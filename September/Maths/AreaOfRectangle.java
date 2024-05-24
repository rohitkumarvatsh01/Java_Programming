import java.util.Scanner;
public class AreaOfRectangle {

    public static void area(int l, int b){
        int area=l*b;
        System.out.println("Area of Rectangle is:- "+area);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Length:- ");
        int l=sc.nextInt();

        System.out.println("Enter the Breadth:- ");
        int b=sc.nextInt();

        area(l, b);
    }
}
