import java.util.Scanner;
public class UpperCaseFirstLetterString {

    public static String upperCase(String str){
        char[] ch=str.toCharArray();
        ch[0]=Character.toUpperCase(ch[0]);

        for(int i=0; i<ch.length; i++){
            if(ch[i]==' '){
                ch[i+1]=Character.toUpperCase(ch[i+1]);
            }
        }
        return new String(ch);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println(upperCase(str));
    }
}
