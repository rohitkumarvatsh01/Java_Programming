import java.util.Scanner;
public class DivisibilityOfFive {

    public static void divisibility(int n){
        if(n%5==0){
            System.out.println("Yes, It is Divisibility of 5");
        }
        else{
            System.out.println("No, It is Not Divisibility of 5");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        divisibility(n);
    }
}
