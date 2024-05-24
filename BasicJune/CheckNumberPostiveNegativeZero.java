import java.util.Scanner;
public class CheckNumberPostiveNegativeZero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        if(n>=1){
            System.out.println("Number is Postive");
        }
        else if(n<0){
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("Number is Zero");
        }
    }
}
