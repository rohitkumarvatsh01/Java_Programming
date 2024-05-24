import java.util.Scanner;
public class LengthOfLastWordString {

    public static int length(String str){
        String[] arr=str.split(" ");
        String ans=arr[arr.length-1];
        return ans.length;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println(length(str));
    }
}
