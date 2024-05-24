import java.util.Scanner;
public class BinarySearch{

    public static int binarySearch(int[] arr, int key){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int mid=(start+end)/2;

        while(start<=end){
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end--;
            }
            mid=(start+end)/2;
        }

        return -1;
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

        System.out.println("Enter the Key:- ");
        int key=sc.nextInt();

        System.out.println("Element is Present or Not:- "+binarySearch(arr, key));
    }
}