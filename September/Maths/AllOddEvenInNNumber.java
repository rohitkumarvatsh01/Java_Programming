import java.util.Scanner;
public class AllOddEvenInNNumber{

    public static void allOddEvenInNNumber(int n){
        if(n%2==0){
            for(int i=2; i<=n; i+=2){
                System.out.print(i+" ");
            }
        }
        else{
            for(int i=1; i<=n; i+=2){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        allOddEvenInNNumber(n);
    }
}