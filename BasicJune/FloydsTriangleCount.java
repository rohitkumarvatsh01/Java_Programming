import java.util.Scanner;
public class FloydsTriangleCount{

    public static void floydsTriangleCount(int n){
        int count=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                count++;
                System.out.print(count);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size:- ");
        int n=sc.nextInt();

        floydsTriangleCount(n);
    }
}