import java.util.Scanner;
public class FloydsTriangleCountCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        char count='A';
        for(char i='A'; i<=n; i++){
            for(char j='A'; j<=i; j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
