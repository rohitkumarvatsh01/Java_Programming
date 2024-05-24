import java.util.Scanner;

public class ActualParameter{
    int add(int a, int b){
        return a+b;
    }
    int sub(int a, int b){
        return a-b;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a:- ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:- ");
        int b=sc.nextInt();

        ActualParameter obj = new ActualParameter();

        System.out.println(obj.add(a, b)); // (a, b) is the actual parameter
        System.out.println(obj.sub(a, b)); // (a, b) is the actual parameter 
    }
}