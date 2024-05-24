import java.util.Scanner;
public class FindMiddian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        int mid=n/2;
        if(n%2==0){
            System.out.println(mid+(mid-1)/2);
        }
        else{
            System.out.println(mid);
        }
    }
}
