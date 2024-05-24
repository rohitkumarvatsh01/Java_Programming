import java.util.Scanner;
public class RotationOfTwoString {

    public static void rotationString(String str1, String str2){
        String str3=str1+str2;
        if(str3.indexOf(str2)!=-1){
            System.out.println("Rotation");
        }
        else{
            System.out.println("Not Rotation");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String1:- ");
        String str1=sc.nextLine();

        System.out.println("Enter the String2:- ");
        String str2=sc.nextLine();

        rotationString(str1, str2);
    }
}
