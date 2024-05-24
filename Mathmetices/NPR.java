import java.util.Scanner;
public class NPR{

    public static int findFact(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }

    public static int npr(int n, int r){
        return findFact(n)/findFact(n-r);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Value:- ");
        int n=sc.nextInt();
        int r=sc.nextInt();

        int ans=npr(n, r);
        System.out.println(ans);
    }
}