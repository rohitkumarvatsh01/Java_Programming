import java.util.Scanner;

public class SortedOrUnsorted{
    static boolean isSorted(int[] arr, int n){
        boolean check=true;
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of the Array:- ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element of the Array:- ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The Sorted or Unsorted:- "+isSorted(arr, n));
    }
}