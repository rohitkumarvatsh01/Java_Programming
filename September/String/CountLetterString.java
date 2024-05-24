import java.util.Scanner;
public class CountLetterString {

    public static int countLetter(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println("Count of Letter in String:- "+countLetter(str));

    }
}
