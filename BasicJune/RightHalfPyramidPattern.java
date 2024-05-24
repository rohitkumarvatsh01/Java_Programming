import java.util.Scanner;
public class RightHalfPyramidPattern {

    public static void rightHalfPyramidPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size:- ");
        int n=sc.nextInt();

        rightHalfPyramidPattern(n);
    }
}
