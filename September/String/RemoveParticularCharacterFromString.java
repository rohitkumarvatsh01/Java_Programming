import java.util.Scanner;
public class RemoveParticularCharacterFromString{

    public static String removeCharacter(String str, char ch){
        String remove="";

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=ch){
                remove+=str.charAt(i);
            }
        }
        return remove;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println("Enter the Character:- ");
        char ch=sc.next().charAt(0);

        System.out.println(removeCharacter(str, ch));
    }
}