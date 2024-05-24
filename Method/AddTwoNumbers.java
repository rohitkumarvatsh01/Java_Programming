import java.util.Scanner;

public class AddTwoNumbers{
    public int add(int a, int b){
        int ans=a+b;
        return ans;
    }
    public static void main(String[] args){
            
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of A:- ");
        int a=sc.nextInt();
        System.out.println("Enter the value of B:- ");
        int b=sc.nextInt();

        AddTwoNumbers obj=new AddTwoNumbers();
        int ans=obj.add(a, b);
        System.out.println("The Sum of A and B is :- " + ans);
    }
}