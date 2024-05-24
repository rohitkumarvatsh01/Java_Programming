import java.util.Scanner;
public class SearchStringIndex {

    public static int searchString(String str1, String str2){
        for(int i=0; i<str1.length(); i++){
            if(str1.contains(str2)){
                return str1.indexOf(str2);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the String1:- ");
        String s1=sc.nextLine();

        System.out.println("Enter the Strint2:- ");
        String s2=sc.nextLine();

        System.out.println("Index of:- "+searchString(s1, s2));
    }
}
