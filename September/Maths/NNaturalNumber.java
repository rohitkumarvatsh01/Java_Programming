import java.util.Scanner;
public class NNaturalNumber{

    public static void nNaturalNumber(int n){
        for(int i=1; i<=n; i++){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();
        
        nNaturalNumber(n);
    }
}