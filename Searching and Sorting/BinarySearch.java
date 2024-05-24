import java.util.Scanner;
public class BinarySearch{

    public static int binarySearch(int[] arr, int key){

        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;

        while(start<=end){
            if(arr[mid]==key){
                return 1;
            }
            else if(arr[mid]<key){
                mid=start++;
            }
            else if(arr[mid]>key){
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

        System.out.println("Enter the Element of Array:- ");
        int[] arr=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the key:- ");
        int key=sc.nextInt();

        int ans=binarySearch(arr, key);
        System.out.println("Element is Found or Not Found:- "+ans);
    }
}