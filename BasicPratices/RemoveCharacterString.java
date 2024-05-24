import java.util.Scanner;
public class RemoveCharacterString{

    public static String removeCharacter(String str, char ch){
        String str2="";
        for(int i=0; i<str.length(); i++){
            if(ch!=str.charAt(i)){
                str2+=str.charAt(i);
            }
        }
        return str2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println("Enter the Remove Character:- ");
        char ch=sc.next().charAt(0);

        System.out.println("Remover Character:- "+removeCharacter(str, ch));
    }
}