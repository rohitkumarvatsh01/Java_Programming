import java.util.Scanner;
public class PalindromeString {

    public static void palindromeString(String str){
        String reverse="";

        for(int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
        }

        if(str.equals(reverse)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is Not Palindrome");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        palindromeString(str);
    }  
}
