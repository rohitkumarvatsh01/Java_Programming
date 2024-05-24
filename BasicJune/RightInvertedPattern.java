import java.util.Scanner;
public class RightInvertedPattern {

    public static void rightInvertedPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=i; k<=n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size:- ");
        int n=sc.nextInt();

        rightInvertedPattern(n);
    }
}
