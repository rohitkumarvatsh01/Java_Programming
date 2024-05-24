import java.util.Scanner;

public class CountGreatestNumber{
    static void countGreater(int[] arr, int n, int x){
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println("The Count of Greatest Element in Array:- "+count);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element of the Array:- ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Greatest Number:- ");
        int x=sc.nextInt();

        countGreater(arr, n, x);;
    }
}