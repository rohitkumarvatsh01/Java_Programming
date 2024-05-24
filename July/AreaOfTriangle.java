import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the A:- ");
        int a=sc.nextInt();

        System.out.println("Enter the B:- ");
        int b=sc.nextInt();

        System.out.println("Enter the C:- ");
        int c=sc.nextInt();

        int s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
    }
}
