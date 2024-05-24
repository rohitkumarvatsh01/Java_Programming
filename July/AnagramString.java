import java.util.Scanner;
import java.util.Arrays;
public class AnagramString{

    public static void anagramString(String str1, String str2){
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        if(ch1.length!=ch2.length){
            System.out.println("Not Anagram String");
        }

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0; i<ch1.length; i++){
            if(ch1[i]!=ch2[i]){
                System.out.println("Not Anagram String");
            }
        }
        System.out.println("Anagram String");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String1:- ");
        String str1=sc.nextLine();

        System.out.println("Enter the String2:- ");
        String str2=sc.nextLine();
        
        anagramString(str1, str2);
    }
}