import java.util.Scanner;
public class AreaofSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the side:- ");
        int a=sc.nextInt();

        int area=a*a;
        System.out.println(area);
    }
}
