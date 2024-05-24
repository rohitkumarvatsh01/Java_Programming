import java.util.Scanner;

public class NNaturalNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        //while loop
        // int i=1;
        // while(i<=num){
        //     System.out.println(i);
        //     i++;
        // }

        for(int i=1; i<=num; i++){
            System.out.println(i);
        }
    }
}
