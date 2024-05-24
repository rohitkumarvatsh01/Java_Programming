import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        int rem;
        int check=num;
        int arm=0;

        while(num>0){
            rem=num%10;
            arm+=(rem*rem*rem);
            num=num/10;
        }

        if(arm==check){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}