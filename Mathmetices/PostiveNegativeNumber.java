import java.util.Scanner;
public class PostiveNegativeNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        if(n>0){
            System.out.println("Postive Number");
        }
        else if(n<0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Zero");
        }
    }
}