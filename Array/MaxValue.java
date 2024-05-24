import java.util.Scanner;

public class MaxValue{

    static int maxValue(int[] arr){
        int max=Integer.MIN_VALUE;
        int n=arr.length;

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

        int[] arr=new int[n];
        System.out.println("Enter the element of Array:- ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The Maximum Value in the Array:- "+ maxValue(arr));
    }
}