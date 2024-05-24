import java.util.Scanner;
public class SumOfOddEven{

    public static int sumOfOddEven(int n){
        int sum=0;
        if(n%2==0){
            for(int i=0; i<=n; i+=2){
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

        int ans=sumOfOddEven(n);
        System.out.println(ans);
    }
}