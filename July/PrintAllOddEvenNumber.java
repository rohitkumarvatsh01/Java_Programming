import java.util.Scanner;
public class PrintAllOddEvenNumber{

    public static void printAllOddEvenNumber(int n){
        for(int i=1; i<=n; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
            else{
                System.out.print(i+" ");
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();

        printAllOddEvenNumber(n);
    }
}