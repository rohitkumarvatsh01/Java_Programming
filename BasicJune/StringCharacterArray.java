import java.util.Scanner;
public class StringCharacterArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();
        
        //Method 1
        char[] ch=new char[str.length()];
        for(int i=0; i<ch.length; i++){
            ch[i]=str.charAt(i);
        }

        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i]+" ");
        }

        System.out.println();
        
        //Method 2
        char ch2[]=str.toCharArray();
        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i]+" ");
        }
    }
}