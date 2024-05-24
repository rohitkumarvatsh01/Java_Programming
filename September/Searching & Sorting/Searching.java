import java.util.Scanner;
public class Searching {

    //Linear Search
    public static int linearSearch(int[] arr, int key){
        int n=arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]==key){
                return 1;
            }
        }
        return -1;
    }

    //Binary Search
    public static int binarySearch(int[] arr, int key){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;

        while(start<=end){
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            mid=(start+end)/2;
        }
        return -1;
    }

    //Main Function
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element in Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Key Element:- ");
        int key=sc.nextInt();

        System.out.println("Linear Search:- "+linearSearch(arr, key));
        System.out.println("Binary Search:- "+binarySearch(arr, key));
    }
}