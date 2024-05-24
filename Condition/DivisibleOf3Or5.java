import java.util.Scanner;

public class DivisibleOf3Or5{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:= ");

        int num=sc.nextInt();

        if(num%3==0 || num%5==0){
            System.out.println("The Number is Divisible By 3 or 5");
        }
        else{
            System.out.println("The number is not divisible by 3 or 5");
        }

    }
}