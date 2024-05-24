import java.util.Scanner;
public class CountFloydTrianglePattern {

    public static void  countFloydsTrianglePattern(int n){
        int count=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        countFloydsTrianglePattern(n);
    }
}
