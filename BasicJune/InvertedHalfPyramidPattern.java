import java.util.Scanner;
public class InvertedHalfPyramidPattern{

    public static void invertedHalfPyramidPattern(int n){
        for(int i=n; i>=0; i--){
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

        invertedHalfPyramidPattern(n);
    }

    *
    **
    ***
    
    ***
    **
    *
}