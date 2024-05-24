import java.util.Scanner;
public class PrintASCIIValue{

    public static void asciiValue(char ch){
        int ans=ch;
        System.out.println(ans);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Character:- ");
        char ch=sc.next().charAt(0);

        asciiValue(ch);
    }
}