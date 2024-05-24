import java.util.Scanner;
public class EvenFirstThanOdd{

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void swapArray(int[] arr, int left, int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    public static void evenFirstThanOdd(int[] arr){
        int left=0;
        int right=arr.length-1;

        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swapArray(arr, left, right);
                left++;
                right--;
            }
            else if(arr[left]%2==0){
                left++;
            }
            else if(arr[right]%2==1){
                right--;
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

        evenFirstThanOdd(arr);
        printArray(arr);
    }
}
