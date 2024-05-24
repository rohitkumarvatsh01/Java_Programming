import java.util.Scanner;
public class Replace0sto5s{

    public static int replace(int n){
        int rem;
        int reverse=0;

        while(n>0){
            rem=n%10;
            if(rem==0){
                reverse=(reverse*10)+5;
            }
            else{
                reverse=(reverse*10)+rem;
            }
            n/=10;
        }

        int ans=0;
        while(reverse>0){
            rem=reverse%10;
            ans=(ans*10)+rem;
            reverse/=10;
        }

        return ans;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        System.out.println(replace(n));
    }
}