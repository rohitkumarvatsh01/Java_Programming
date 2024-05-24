import java.util.Scanner;
public class OddEvenBetweenN{

    public static void oddEven(int n){
        System.out.println("Even Number:- ");
        for(int i=1; i<=n; i++){
            if(i%2==0){
                System.out.print(i+" ");;
            }
        }

        System.out.println("Odd Number:- ");
        for(int i=0; i<=n; i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        oddEven(n);
    }
}