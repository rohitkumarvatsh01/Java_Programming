import java.util.Scanner;

public class OddEvenSumNNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enetr the Number:- ");
        int n=sc.nextInt();

        int sum=0;

        for(int i=1; i<=n; i++){
            if(n%2==0){
                if(i%2==0){
                    sum+=i;
                }
            }
            else{
                if(i%2==1){
                    sum+=i;
                }
            }
        }

        System.out.println("Sum of Odd and Even:- "+sum);
    }
}