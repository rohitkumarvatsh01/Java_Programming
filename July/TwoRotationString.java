import java.util.Scanner;
public class TwoRotationString {

    public static boolean rotationString(String str1, String str2){
        String p=str1+str2;
            
        return p.contains(str2);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String1:- ");
        String str1=sc.nextLine();

        System.out.println("Enter the String2:- ");
        String str2=sc.nextLine();

        System.out.println(rotationString(str1, str2));
    }
}
