import java.util.Scanner;

public class SumOfNNaturalNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        int sum=0;

        /*While loop
        int i=1;

        while(i<=num){
            sum+=i;
            i++;
        }
        */

    
        for(int i=1; i<=num; i++){
            sum+=i;
        }
        
        System.out.println("Sum of N Natural Number is:- "+ sum);
    }
}