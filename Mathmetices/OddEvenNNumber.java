import java.util.Scanner;
public class OddEvenNNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int num=sc.nextInt();

        for(int i=1; i<=num; i++){

            if(num%2==0){
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
            else{
                if(i%2==1){
                    System.out.print(i+" ");
                }
            }
            
        }
    }
}