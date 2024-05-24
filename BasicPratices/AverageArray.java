import java.util.Scanner;
public class AverageArray{

    public static int averageArray(int[] arr){
        int n=arr.length;
        int sum=0;

        for(int i=0; i<n; i++){
            sum+=arr[i];
        }

        int avg=sum/n;
        return avg;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int ans=averageArray(arr);
        System.out.println("Average of Array:- "+ans);
        
    }
}