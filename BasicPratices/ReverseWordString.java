import java.util.Scanner;
public class ReverseWordString{

    public static String reverseWordString(String s){
        String reverse="";
        String[] arr=s.split(" ");

        for(int i=arr.length-1; i>=0; i--){
            reverse=reverse+arr[i]+" ";
        }

        return reverse;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println(reverseWordString(str));
    }
}
