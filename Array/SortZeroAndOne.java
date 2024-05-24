import java.util.Scanner;

public class SortZeroAndOne{

    static void printArray(int[] arr){
        System.out.println("Sorted Array is:- ");
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print (arr[i]+" ");
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
    
    static void sortZeroAndOne(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;

        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr, left, right);
                left++;
                right--;
            }

            if(arr[left]==0){
                left++;
            }

            if(arr[right]==1){
                right--;
            }
        }
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

        sortZeroAndOne(arr);
        printArray(arr);
    }
}