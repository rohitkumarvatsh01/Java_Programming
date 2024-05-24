import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack{

    public static String reverseStringUsingStack(String str){
        Stack<Character>ans=new Stack<>();
        for(int i=0; i<str.length(); i++){
            Stack.push(str.charAt(i));
        }
        
        String reverse="";
        for(int i=0; i<str.length(); i++){
            reverse=revesre+Stack.pop();
        }

        return reverse;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println(reverseStringUsingStack(str));
    }
}