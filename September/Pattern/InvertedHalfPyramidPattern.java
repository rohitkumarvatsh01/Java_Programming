import java.util.Scanner;
public class InvertedHalfPyramidPattern{

    public static void invertedHalfPyramidPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        invertedHalfPyramidPattern(n);
    }
}