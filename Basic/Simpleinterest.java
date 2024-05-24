import java.util.*;

public class Simpleinterest{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Principle:- ");
        int p=sc.nextInt();

        System.out.println("Enter the value of Rate:- ");
        int r=sc.nextInt();

        System.out.println("Enter the value of Time:- ");
        int t=sc.nextInt();

        int si=(p*r*t)/100;

        System.out.println("The Siimple Intreste is:- " + si);
    }
}
