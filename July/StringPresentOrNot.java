import java.util.Scanner;
public class StringPresentOrNot {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        System.out.println("Enter the Occurance:- ");
        String occ=sc.nextLine();

        if(str.contains(occ)){
            System.out.println("Present");
        }
        else{
            System.out.println("Not Present");
        }
    }
}
