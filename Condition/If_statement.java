import java.util.Scanner;

public class If_statement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Value of Number");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("The Number is Divisible by 2");
        }
    }
}