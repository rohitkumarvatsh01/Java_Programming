import java.util.Scanner;
public class LengthLastWordString {

    public static int lengthString(String str){
        int count=0;
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine(); 

        System.out.println(lengthString(str));

    }
}
