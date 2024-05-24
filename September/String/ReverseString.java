import java.util.Scanner;
public class ReverseString {

    public static void reverseStringUsingStringBuffer(String str){
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());
    }

    public static void reverseStringUsingStringBuilder(String str){
        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse());
    }

    public static String reverseString(String str){
        String reverse="";
        for(int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();
        
        reverseStringUsingStringBuilder(str);
        reverseStringUsingStringBuffer(str);
        System.out.println(reverseString(str));
    }
}
