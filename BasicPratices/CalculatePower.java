import java.util.Scanner;
public class CalculatePower{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();
        int result=1;

        for(int i=1; i<=num; i++){
            result=result*num;
        }
        System.out.println(result);
    }
}