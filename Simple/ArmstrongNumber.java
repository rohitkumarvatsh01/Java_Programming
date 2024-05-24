import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        int cum=num;
        int rem=0;
        int arm=0;
        int n;

        while(num>0){
            rem=num%10;
            arm=(rem*rem*rem)+arm;
            num/=10;
        }

        if(arm==cum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number")
        }
    }
}