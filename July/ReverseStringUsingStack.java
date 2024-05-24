import java.util.Scanner;
public class ReverseStringUsingStack {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        Stack<Character>stack=new Stack<>();
        for(int i=0; i<str.length(); i++){
            stack.push(str.charAt(i));

            String reverse="";
            for(int i=0; i<str.length(); i++){
                reverse=reverse+stack.pop();
            }
        }
        return reverse;
    }
}
