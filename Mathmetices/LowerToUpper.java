import java.util.Scanner;
public class LowerToUpper{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Character:- ");
        char ch=sc.next().charAt(0);
        
        char ch2;
        if(ch>='A' && ch<='Z'){
            ch2=Character.toLowerCase(ch);
        }
        else{
            ch2=Character.toUpperCase(ch);
        }

        System.out.println(ch2);
    }
}