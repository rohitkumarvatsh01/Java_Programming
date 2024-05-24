import java.util.Scanner;

public class oddAndEven{

    static void oddEven(int n){
        if(n%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number is:- ");
        int n=sc.nextInt();
        oddEven(n);

    }
}