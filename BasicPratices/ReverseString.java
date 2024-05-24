import java.util.Scanner;
public class ReverseString{

    //String Buffer Method
    public static void stringBuffer(String str){
        ReverseString sb=new ReverseString(str);
        System.out.println(sb.reverse());
    }

    //String Builder
    public static void stringBuilder(String str){
        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse());
    }

    //Own Method
    public static String ownMethod(String str){
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

        stringBuffer(str);

        stringBuffer(str);

        System.out.println(ownMethod(str));
    }
}