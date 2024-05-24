import java.util.Scanner;
public class SumOfOddEven{

    public static void sumOfOddEven(int n){
        int even=0;
        int odd=0;

        if(n%2==0){
            for(int i=0; i<=n; i+=2){
                even+=i;
            }
            System.out.println("Sum of Even:- "+even);
        }
        else{
            for(int i=1; i<=n; i+=2){
                odd+=i;
            }
            System.out.println("Sum of Odd:- "+odd);
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        sumOfOddEven(n);
    }
}