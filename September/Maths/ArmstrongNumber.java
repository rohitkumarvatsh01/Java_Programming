import java.util.Scanner;
public class ArmstrongNumber{

    public static void armstrongNumber(int n){
        int rem;
        int chk=n;
        int arm=0;
        
        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n/=10;
        }

        if(arm==chk){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        armstrongNumber(n);
    }
}