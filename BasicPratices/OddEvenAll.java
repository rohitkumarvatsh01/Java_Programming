import java.util.Scanner;
public class OddEvenAll{

    public static void oddEvenAll(int n){
        for(int i=1; i<=n; i++){
            if(i%2==0){
                System.out.println("Even Number:- "+i);
            }
            else{
                System.out.println("Odd Number:- "+i);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        oddEvenAll(n);
    }
}