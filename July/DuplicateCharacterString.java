import java.util.Scanner;
public class DuplicateCharacterString {

    public static char duplicateString(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length()-1; j++){
                if(str.charAt(i)==str.charAt(j)){
                    return str.charAt(i);
                }
            }
        }
        return '$';
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println(duplicateString(str));
    }
}
