import java.util.Scanner;

public class Palindrome{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();
        
        int c=n;
        int r;
        int s=0;
        
        while(n>0){
            
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        
        if(c==s){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}