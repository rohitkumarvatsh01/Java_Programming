import java.util.Scanner;
public class RemoveCharacterString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str1=sc.nextLine();

        System.out.println("Enter the Character:- ");
        char ch=sc.next().charAt(0);
        
        String str2="";

        for(int i=0; i<str1.length(); i++){
            if(ch!=str1.charAt(i)){
                str2=str2+str1.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
