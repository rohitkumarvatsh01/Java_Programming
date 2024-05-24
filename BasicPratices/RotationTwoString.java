import java.util.Scanner;
public class RotationTwoString{

    public static int rotationString(String str1, String str2){
        if(str1.length()!=str2.length()){
            return -1;
        }
        
        String str3=str1+str2;
        if(str3.contains(str2)){
            return str3.indexOf(str2);
        }
          
        return -1;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String1:- ");
        String s1=sc.nextLine();

        System.out.println("Enter the String2:- ");
        String s2=sc.nextLine();

        System.out.println("String Present or not:- "+rotationString(s1, s2));
    }
}