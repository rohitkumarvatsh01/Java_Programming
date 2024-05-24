import java.util.Scanner;

public class Pramid121 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Value of N:- ");
        int n=sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-1; j++){
                System.out.print(" ");
            }

            //print 1 to i
            for(int k=1; k<=i; k++){
                System.out.print(k);
            }

            //print i-1 to 1
            for(int l=i-1; l>=1; l--){
                System.out.print(l);
            }
            
            System.out.println();
        }
    }
}
