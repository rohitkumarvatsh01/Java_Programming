import java.util.Scanner;
public class SumOfNNaturalNumber{
    public static int sumOfNumber(int num){
        int sum=0;
        for(int i=1; i<=num; i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        System.out.println("Sum of N natural Number:- "+sumOfNumber(num));
    }
}