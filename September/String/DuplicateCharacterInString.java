import java.util.Scanner;
public class DuplicateCharacterInString {

    public static String duplicateCharacter(String str){
        String ans="";
        for(int i=0; i<str.length()-1; i++){
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    ans=ans+str.charAt(i);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println(duplicateCharacter(str));
    }
}
