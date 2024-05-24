import java.util.Scanner;
public class OccuranceString {

    public static int occuranceString(String str, String occ){
        for(int i=0; i<str.length(); i++){
            if(str.contains(occ)){
                return str.indexOf(occ);
            }
        }
        return '$';

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println("Enter the Character:- ");
        String occ=sc.nextLine();

        System.out.println(occuranceString(str, occ));
    }
}
