import java.util.Scanner;
public class BinarySearch {

    public static int binarySearching(int[] arr, int key){
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
            else{
                end--;
            }
            mid=(start+end)/2;
        }
        return 0;
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

        System.out.println("Enter the Search Element:- ");
        int x=sc.nextInt();

        System.out.println(binarySearching(arr, x));
    }
}
