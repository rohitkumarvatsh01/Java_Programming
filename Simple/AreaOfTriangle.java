import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the side of Triangal:- ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int area;
        int s;

        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area:- "+area);
    }
}
