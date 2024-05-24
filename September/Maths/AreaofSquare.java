import java.util.Scanner;
public class AreaofSquare {

    public static void areaSquare(int a){
        int area=a*a;
        System.out.println(area);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Side:- ");
        int a=sc.nextInt();

        areaSquare(a);
    }
}
