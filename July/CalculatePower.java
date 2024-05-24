import java.util.Scanner;
public class CalculatePower {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        System.out.println("Enter the Power:- ");
        int power=sc.nextInt();
        int result=1;

        for(int i=1; i<=power; i++){
            result=result*num;
        }

        System.out.println(result);
    }
}
