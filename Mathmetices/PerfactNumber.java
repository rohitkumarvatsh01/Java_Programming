import java.util.Scanner;
public class PerfactNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        int perfect=0;

        for(int i=1; i<n; i++){
            if(n%i==0){
                perfect+=i;
            }
        }

        if(perfect==n){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not Perfect Number");
        }
    }
}