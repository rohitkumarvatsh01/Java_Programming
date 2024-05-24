import java.util.Scanner;
public class MaximumAndMinimumValueArray{

    public static int minumumElement(int[] arr, int n){
        int min=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static int maximumElement(int[] arr, int n){
        int max=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        

        int min=minumumElement(arr, n);
        int max=maximumElement(arr, n);

        System.out.println("The Minimum Element in Array is:- "+min);
        System.out.println("The Maximum Element in Array is:- "+max);
    }
}