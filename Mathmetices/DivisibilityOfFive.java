import java.util.Scanner;
public class DivisibilityOfFive{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        if(n%5==0){
            System.out.println("It is Divisible By 5");
        }
        else{
            System.out.println("It is Not Divisible By 5");
        }
    }
}