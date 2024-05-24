import java.util.Scanner;
public class PalindroneString{

    public static void palindroneString(String str){
        String reverse="";
        for(int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
        }

        if(str.equals(reverse)){
            System.out.println("String is Palindrone");
        }
        else{
            System.out.println("String is Not Palindrone");
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        palindroneString(str);
    }
}