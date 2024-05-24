import java.util.Scanner;
import java.util.Arrays;

public class AnagramString {

    public static boolean anagramString(String s1, String s2){
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();

        if(ch1.length != ch2.length){
            return false;
        }

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0; i<ch1.length; i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String1:- ");
        String str1=sc.nextLine();

        System.out.println("Enter the String2:- ");
        String str2=sc.nextLine();

        System.out.println(anagramString(str1, str2));
    }
}
