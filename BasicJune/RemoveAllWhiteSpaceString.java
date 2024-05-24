import java.util.Scanner;
public class RemoveAllWhiteSpaceString {

    public static String revomeWhiteSPaceString(String str){

        String ans="";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=' '){
                ans=ans+str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println(revomeWhiteSPaceString(str));
    }
}
