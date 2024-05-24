import java.util.Scanner;
public class SumNNaturalNumber{

    public static int sumNNaturalNumber(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        System.out.print(sumNNaturalNumber(n));
    }
}