import java.util.Scanner;
public class ConvertCharacterToArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        //Method-1
        // char[] ch=new char[str.length()];
        // for(int i=0; i<str.length(); i++){
        //     ch[i]=str.charAt(i);
        // }

        // for(int i=0; i<ch.length; i++){
        //     System.out.print(ch[i]+" ");
        // }

        //Method -2
        char[] ch2=str.tocharArray();
        for(int i=0; i<ch2.length; i++){
            System.out.println(ch2[i]+" ");
        }

    }
}