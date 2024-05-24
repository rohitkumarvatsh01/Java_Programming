import java.util.Scanner;
public class OddEven {

    public static void oddEven(int n){
        if(n%2==0){
            System.out.println("Even Number");
        }
        else if(n%2==1){
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        oddEven(n);
    }
}
