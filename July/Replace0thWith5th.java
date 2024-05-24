import java.util.Scanner;
public class Replace0thWith5th {

    public static int replace0thWith5th(int n){
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
            n/=10;
        }

        int rev=0;
        while(s>0){
            rem=s%10;
            rev=(rev*10)+rem;
            s/=10;
        }

        return rev;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        System.out.println("Replace 0th with 5th:- "+replace0thWith5th(n));
    }
}
