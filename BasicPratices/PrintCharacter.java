import java.util.Scanner;
public class PrintCharacter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Character:- ");
        char ch=sc.next().charAt(0);

        System.out.println(ch);
    }
}