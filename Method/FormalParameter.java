import java.util.Scanner;

public class FormalParameter{
    int add(int a, int b){  //int b and int b are the formal parameters
        int ans=a+b;
        return ans;
    }
    int sub(int a, int b){
        int ans=a-b;
        return ans;
    }

    public static void main(String[] args){
        FormalParameter obj = new FormalParameter();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Value of num1:- ");
        int num1=sc.nextInt();
        System.out.println("Enter the Value of num2:- ");
        int num2=sc.nextInt();

        System.out.println(obj.add(num1, num2));
        System.out.println(obj.sub(num1, num2));
    }
}