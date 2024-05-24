import java.util.Scanner;

public class BinarySearch{

    static int binarySearch(int[] arr, int n, int key){
        int start=0;
        int end=n-1;

        int mid=(start+end)/2;

        while(start<=end){
            if(arr[mid]==key){
                return 1;
            }
            else if(arr[mid]<key){
                mid=start++;

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

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the key value:- ");
        int key=sc.nextInt();

        System.out.println(binarySearch(arr, n, key));
    }
}