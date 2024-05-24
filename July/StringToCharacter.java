import java.util.Scanner;
public class StringToCharacter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        char[] ch=new char[str.length()];
        for(int i=0; i<str.length(); i++){
            ch[i]=str.charAt(i);
        }

        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i]+" ");
        }

        char[] chh=str.toCharArray();
        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i]+" ");
        }
    }
}
