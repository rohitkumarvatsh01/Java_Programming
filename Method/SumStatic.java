import java.util.Scanner;

public class SumStatic{
    static int add(int a, int b){
        //Static access modifier is to without object ka call ho jayega
        int ans=a+b;
        return ans;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of Num1:- ");
        int num1=sc.nextInt();
        System.out.println("Enter the value of Num2:- ");
        int num2=sc.nextInt();

        int ans=add(num1, num2);
        System.out.println("The Sum of Num1 and Num2:- "+ans);
    }
}