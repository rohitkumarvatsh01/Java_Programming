import java.util.Scanner;
public class Pratices{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:- ");
        String str=sc.nextLine();

        int count=0;

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);

            count++;
        }

        System.out.println(count);

    }
}