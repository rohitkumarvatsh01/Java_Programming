import java.util.Scanner;
public class SecondLargestElement{

    public static int firstLargest(int[] arr){
        int large=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        return large;
    }

    public static int SecondLargest(int[] arr){
        int large=firstLargest(arr);

        for(int i=0; i<arr.length; i++){
            if(arr[i]==large){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        int second=firstLargest(arr);
        return second;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element in Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Second Largest Element:- "+SecondLargest(arr));
    }
}