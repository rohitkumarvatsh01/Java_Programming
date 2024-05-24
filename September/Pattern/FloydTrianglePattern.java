import java.util.Scanner;
public class FloydTrianglePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.next().charAt(0);


        char count='A';

        for(char i='A'; i<=n; i++){
            for(char j='A'; j<=i; j++){
                System.out.print(count);
            }
            System.out.println();
        }
    }
}
