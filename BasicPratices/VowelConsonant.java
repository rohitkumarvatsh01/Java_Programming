import java.util.Scanner;
public class VowelConsonant{

    public static void vowelConsonant(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
           ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("Character is Vowel");
        }
        else{
            System.out.println("Character is Consonant");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Chacareter:- ");
        char ch=sc.next().charAt(0);

        vowelConsonant(ch);
    }
}