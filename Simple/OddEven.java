import java.util.Scanner;

public class  OddEven{
    public static void oddEven(int num){
        if(num%2==0){
            System.out.println("The Number is Even");
        }
        else{
            System.out.println("The Number is Odd");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number:- ");
        int num=sc.nextInt();

        oddEven(num);
    }
}