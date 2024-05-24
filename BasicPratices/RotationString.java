import java.util.Scanner;
public class RotationString {

    public static boolean rotationString(String s1, String s2){
        String s3=s1+s2;

        if(s3.indexOf(s2)!=-1){
            return true;
        }
        return false;
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
