import java.util.Scanner;
public class SortZeroOne{

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void swapArray(int[] arr, int left, int right){
        int temp;
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    //Method-1
    public static void sortZeroOne(int[] arr){
        int left=0;
        int right=arr.length-1;

        while(left<right){
            if(arr[left]==0){
                left++;
            }
            else if(arr[right]==1){
                right--;
            }
            else if(arr[left]==1 && arr[right]==0){
                swapArray(arr, left, right);
                left++;
                right--;
            }
        }
    }

    //Method-2
    public static void sortZeroOnes(int[] arr){
        int zeroCount=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zeroCount++;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(i<zeroCount){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Print Array Method-1");
        sortZeroOne(arr);
        printArray(arr);

        System.out.println("Print Array Method-2");
        sortZeroOnes(arr);
        printArray(arr);
    }
}