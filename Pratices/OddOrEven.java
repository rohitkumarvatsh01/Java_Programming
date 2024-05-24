import java.util.Scanner;

public class OddOrEven{

    public static void oddEven(int num){
        if(num%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        oddEven(num);
    }
}