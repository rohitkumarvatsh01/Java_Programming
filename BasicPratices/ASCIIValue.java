import java.util.Scanner;
public class ASCIIValue{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Chacater:- ");
        char ch=sc.next().charAt(0);

        System.out.println((int)ch);
    }
}
// ASCIIValue
// A-Z ->65-90
// a-z ->97-122