import java.util.Scanner;

public class FirstLargestElement{
    static int firstLargestElement(int[] arr){

        int n=arr.length;
        int mx=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element of the Array:- ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The Maximum Value of the Array:- "+ firstLargestElement(arr));
    }
}