import java.util.Scanner;
public class RotationString{

    public static void rotationString(String str1, String str2){
        String str3=str1+str2;

        if(str3.indexOf(str2)!=-1){
            System.out.println("Rotation String");
        }
        else{
            System.out.println("Not Rotation String");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str1=sc.nextLine();

        System.out.println("Enter the String:- ");
        String str2=sc.nextLine();

        rotationString(str1, str2);
    }
}