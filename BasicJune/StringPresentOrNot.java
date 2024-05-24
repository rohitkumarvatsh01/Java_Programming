import java.util.Scanner;
public class StringPresentOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str1=sc.nextLine();

        System.out.println("Enter the String which one check:- ");
        String str2=sc.nextLine();

        if(str1.contains(str2)){
            System.out.println("String Contains");
        }
        else{
            System.out.println("String not Contains");
        }
    }
}
