import java.util.Scanner;

public class Replace0to5{

    static int replace0to5(int num){

        int r;
        int s=0;

        while(num>0){
            r=num%10;
            if(r==0){
                s=(s*10)+5;
            }
            else{
                s=(s*10)+r;
            }
            num=num/10;
        }

        return s;
    }

    static int reverseDigit(int n){
        int rev=0;
        int s=replace0to5(n);
        int r;

        while(s>0){
            r=s%10;
            rev=(rev*10)+r;
            s=s/10;
        }

        return rev;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the digits:- ");
        int n=sc.nextInt();

        System.out.println(reverseDigit(n));
    }
}