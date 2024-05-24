import java.util.Scanner
;
public class ForLoops{
    public static void main(String[] args){

        System.out.println("Enter the Number:- ");
        Scanner sc=new Scanner(System.in);

        int num1=sc.nextInt();
        System.out.println("**");
        for(int i=1; i<=10; i++){
            System.out.println(num1*i);
        }
    }
}