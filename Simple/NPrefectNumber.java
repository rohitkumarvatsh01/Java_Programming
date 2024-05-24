import java.util.Scanner;

public class NPrefectNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        int p;
        int s;
        for(int i=1; i<=num; i++){
            s=Math.sqrt(i*i);
            p=s*i;
            System.out.println(p);
        }
    }
}