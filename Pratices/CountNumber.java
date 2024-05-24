import java.util.Scanner;

import javax.management.openmbean.CompositeType;
public class CountNumber{

    public static int countNumber(int num){
        int rem;
        int count=0;
        while(num>0){
            rem=num%10;
            count++;
            num=num/10;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the  Number:- ");
        int num=sc.nextInt();

        System.out.println("The Count of Digit is:- "+countNumber(num));
    }
}