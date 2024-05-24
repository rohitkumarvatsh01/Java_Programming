import java.util.Scanner;
public class RemoveParticularCharacterString {

    public static String removerCharacter(String str, char ch){
        String ans="";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=ch){
                ans=ans+str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println("Enter the Character:- ");
        char ch=sc.next().charAt(0);

        System.out.println((removerCharacter(str, ch)));
    }
}
