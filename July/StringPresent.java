import java.util.Scanner;
public class StringPresent {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println("Enter the Search String:- ");
        String s=sc.nextLine();

        System.out.println(str.contains(s));
    }
}
