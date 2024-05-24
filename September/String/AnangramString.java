import java.util.*;
public class AnangramString {

    public static void anangramString(String str1, String str2){
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        if(ch1.length!=ch2.length){
            System.out.println("Not Ananagram String");
        }

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0; i<ch1.length; i++){
            if(ch1[i]!=ch2[i]){
                System.out.println("Not Ananagram String");
            }
        }

        System.out.println("Ananagram String");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String1:- ");
        String str1=sc.nextLine();

        System.out.println("Enter the String2:- ");
        String str2=sc.nextLine();

        anangramString(str1, str2);
    }
}
