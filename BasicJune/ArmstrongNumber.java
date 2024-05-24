import java.util.Scanner;
public class ArmstrongNumber{

    public static void armstrongNumber(int n){
        int rem;
        int arm=0;
        int store=n;

        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }

        if(arm==store){
            System.out.println("Number is Armstrong Number");
        }
        else{
            System.out.println("Number is Not Armstrong Number");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        armstrongNumber(n);
    }
}