import java.util.Scanner;
public class InsertionSort{

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertionSort(int[] arr){
        int n=arr.length;

        for(int i=1; i<n; i++){
            int j=i;

            while(j>0 && arr[j]<arr[j-1]){
                int temp;
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
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

        insertionSort(arr);
        printArray(arr);
    }
}
