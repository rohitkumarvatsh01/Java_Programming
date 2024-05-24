import java.util.Scanner;
public class Sum{
    public int add(int a, int b){
        //yaha access modifier public hai to object create kr ke call hoga 
        //kyu ki ye public accss modifier hai
        int ans=a+b;
        return ans;
    }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter the value of Num1:- ");
            int num1=sc.nextInt();
            System.out.println("Enter the value of Num2:- ");
            int num2=sc.nextInt();
            
            Sum obj=new Sum();
            int ans=obj.add(num1, num2);

            System.out.println("The Sum of Num1 and Num2 is:- "+ans);

        }
}