import java.util.Scanner;
public class EvenOddSortArray {

    public static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void evenOddSort(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;

        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }

            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
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

        evenOddSort(arr);
        printArray(arr);

    }
}
