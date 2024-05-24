import java.util.Scanner;

public class LinearSearching{

    public static int linearSearching(int[] arr, int key){
        int n=arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]==key){
                return 1;
            }
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
        
        System.out.println("Enter the Key:- ");
        int key=sc.nextInt();
        
        int ans=linearSearching(arr, key);
        System.out.println("Element is Found or Not:- "+ ans);

    }
}