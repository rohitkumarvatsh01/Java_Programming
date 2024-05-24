import java.util.Scanner;
public class ReverseString{

    public static String reverse(String str){
        String ans="";
        for(int i=str.length()-1; i>=0; i--){
            ans=ans+str.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println(reverse(str));
    }
}