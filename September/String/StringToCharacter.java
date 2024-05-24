import java.util.Scanner;
public class StringToCharacter {

    public static void case1(String str){
        char[] ch=new char[str.length()];
        for(int i=0; i<ch.length; i++){
            ch[i]=str.charAt(i);
        }

        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i]+" ");
        }
    }

    public static void case2(String str){
        char[] ch=str.toCharArray();
        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        case1(str);
        System.out.println();
        case2(str);
    }
}
