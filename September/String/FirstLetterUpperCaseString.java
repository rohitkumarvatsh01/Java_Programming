import java.util.Scanner;
public class FirstLetterUpperCaseString{

    public static String upperCase(String str){
        char[] ch=str.toCharArray();
        ch[0]=Character.toUpperCase(ch[0]);

        for(int i=1; i<ch.length-1; i++){
            if(ch[i]==' '){
                ch[i+1]=Character.toUpperCase(ch[i+1]);
            }
        }
        return new String(str);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println(upperCase(str));
    }
}