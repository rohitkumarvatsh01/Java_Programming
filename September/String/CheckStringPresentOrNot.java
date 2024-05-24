import java.util.Scanner;
public class CheckStringPresentOrNot {

    public static void checkString(String str1, String str2){
        if(str1.contains(str2)){
            System.out.println("String is Presnt");
        }
        else{
            System.out.println("Sring is Not Present");
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String1:- ");
        String str1=sc.nextLine();

        System.out.println("Enter the String2:- ");
        String str2=sc.nextLine();

        checkString(str1, str2);
    }
}
