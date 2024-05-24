import java.util.Scanner;

public class RectangelArea{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length:- ");
        int length=sc.nextInt();

        System.out.println("Enter the Breath:- ");
        int breath=sc.nextInt();

        int area=length*breath;

        System.out.println("The Area of Rectagle:- "+area);

    }
}