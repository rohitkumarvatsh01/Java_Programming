import java.util.Scanner;
public class SmallestLargestElementArray {

    public static int smallestElement(int[] arr){
        int n=arr.length;

        int small=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        return small;
    }

    public static int largestElement(int[] arr){
        int n=arr.length; 

        int large=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        return large;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element int Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int small=smallestElement(arr);
        System.out.println("Smallest Element:- "+small);

        int large=largestElement(arr);
        System.out.println("Largest Element:- "+large);
    }
}
