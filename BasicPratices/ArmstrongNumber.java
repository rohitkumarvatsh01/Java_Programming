import java.util.Scanner;
public class ArmstrongNumber{
    
    public static boolean armstrongNumber(int n){
        int check=n;
        int arm=0;
        int rem;

        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }

        if(arm==check){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        System.out.println(armstrongNumber(n));
    }
}