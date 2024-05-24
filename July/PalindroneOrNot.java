import java.util.Scanner;
public class PalindroneOrNot {

    public static boolean palindroneOrNot(int n){
        int rem;
        int check=n;
        int reverse=0;
        while(n>0){
            rem=n%10;
            reverse=(reverse*10)+rem;
            n=n/10;
        }

        if(reverse==check){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        boolean ans=palindroneOrNot(n);
        System.out.println("Palindrone:- "+ans);
    }
}
