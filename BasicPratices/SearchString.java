import java.util.Scanner;
public class SearchString{

    public static boolean searchString(String s1, String s2){
        if(s1.contains(s2)){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String1:- ");
        String s1=sc.nextLine();

        System.out.println("Enter the String2:- ");
        String s2=sc.nextLine();

        System.out.println("String Present or not:- "+searchString(s1, s2));
    }
}