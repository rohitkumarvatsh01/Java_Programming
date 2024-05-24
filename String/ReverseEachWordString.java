import java.util.Scanner;
public class ReverseEachWordString{

    public static String reverseEachWordString(String str){
        String[] s=str.split(" ");
        String reverseString="";

        for(int i=0; i<s.length; i++){
            String word=s[i];
            String reverseWord="";

            for(int j=word.length()-1; j>=0; j--){
                reverseWord=reverseWord+word.charAt(j);
            }

            reverseString=reverseString+reverseWord+" ";
        }

        return reverseString;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println(reverseEachWordString(str));
    }
}