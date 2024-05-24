import java.util.Scanner;
public class PrintCharacter{

    public static void print(char ch){
        System.out.println(ch);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Character:- ");
        char ch=sc.next().charAt(0);

        print(ch);
    }
}