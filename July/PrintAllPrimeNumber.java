import java.util.Scanner;
public class PrintAllPrimeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number1:- ");
        int n1=sc.nextInt();

        System.out.println("Enter the Number2:- ");
        int n2=sc.nextInt();

        for(int i=n1; i<=n2; i++){
            for(int j=2; j<=i; j++){
                if(i%j==0){
                    break;
                }
            
            if(i==j){
                System.out.print(j+" ");
            }
        }
        }
    }
}
