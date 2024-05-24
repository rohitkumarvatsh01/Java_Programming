import java.util.Scanner;
public class NNaturalNumber{

    public static void nNaturalNumber(int num){
        for(int i=1; i<=num; i++){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        nNaturalNumber(num);

    }
}