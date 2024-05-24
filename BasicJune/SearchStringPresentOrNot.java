import java.util.Scanner;
public class SearchStringPresentOrNot {

    public static boolean searchString(String str, String x){
        if(str.contains(x)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println("Enter the String Search:- ");
        String x=sc.nextLine();

        boolean ans=searchString(str, x);
        System.out.println("String Prsent or not:- "+ans);
    }
}
