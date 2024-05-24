import java.util.Scanner;
public class CharacterFloydTrianglePattern {

    public static void pattern(char n){
        for(char i='A'; i<=n; i++){
            for(char j='A'; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Character:- ");
        char n=sc.next().charAt(0);

       pattern(n);

    }
}
