import java.util.Scanner;
public class SumOfAllOddEvenInNNumber{

    public static int sumOfAllOddEvenInNNumber(int n){
        int sum=0;
        if(n%2==0){
            for(int i=2; i<=n; i+=2){
                sum+=i;
            }
        }
        else{
            for(int i=1; i<=n; i+=2){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        System.out.println(sumOfAllOddEvenInNNumber(n));
    }
}