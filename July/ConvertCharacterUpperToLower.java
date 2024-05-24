import java.util.Scanner;
public class ConvertCharacterUpperToLower {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Character:- ");
        char ch=sc.next().charAt(0);

        if(ch>='A' && ch<='Z'){
            System.out.println(Character.toLowerCase(ch));
        }
        else{
            System.out.println(Character.toUpperCase(ch));
        }
    }
}
