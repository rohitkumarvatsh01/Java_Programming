import java.util.Scanner;

public class LowerToUpper{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Character:- ");
        char ch=sc.next().charAt(0);

        if(ch>='a' && ch<='z'){
            ch=ch-32;
            System.out.println(ch);
        }
        else{
            ch=ch+32;
            System.out.println(ch);
        }
    }
}