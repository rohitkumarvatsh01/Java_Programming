import java.util.Scanner;
public class PrintFloydsTrianglePattern {

    public static void  printFloydsTrianglePattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        printFloydsTrianglePattern(n);
    }
}
