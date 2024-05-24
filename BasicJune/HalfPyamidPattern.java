import java.util.Scanner;
public class HalfPyamidPattern {

    public static void halfPyamidPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size:- ");
        int n=sc.nextInt();

        halfPyamidPattern(n);
    }
}
