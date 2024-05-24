import java.util.Scanner;
public class PositiveOrNegativeNumber{

    public static void checkNumber(int n){
        if(n>0){
            System.out.println("Positive Number");
        }
        else if(n<0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Zero Number");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        checkNumber(n);
    }
}