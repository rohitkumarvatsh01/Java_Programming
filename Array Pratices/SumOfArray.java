import java.util.Scanner;

public class SumOfArray{

    //Sum of Array
    public static int sumOfArray(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    //Main Function
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        //Function calling
        int ans=sumOfArray(arr);
        System.out.println("The Sum of Array:- "+ ans);
    }
}