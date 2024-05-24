import java.util.Scanner;
public class ReplaceZeroWithFive{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        int rem;
        int s=0;

        while(n>0){
            rem=n%10;
            if(rem==0){
                s=(s*10)+5;
            }
            else{
                s=(s*10)+rem;
            }
            n=n/10;
        }

        int rev=0;
        while(s>0){
            rem=s%10;
            rev=(rev*10)+rem;
            s=s/10;
        }
        System.out.println(rev);
    }
}