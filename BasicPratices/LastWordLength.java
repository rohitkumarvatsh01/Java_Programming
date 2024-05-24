import java.util.Scanner;
public class LastWordLength {

    public static int lengthLastWord(String s){
        int length=0;

        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)!=' '){
                length++;
            }
            else{
                if(length>0)
                    return length;
            }
        }
        return length;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String s=sc.nextLine();

        System.out.println("Length of Last Word:- "+lengthLastWord(s));
    }
}
