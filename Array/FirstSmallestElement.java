import java.util.Scanner;

public class FirstSmallestElement{
    static int firstSmallestElement(int[] arr){

        int min=Integer.MAX_VALUE;
        int n=arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of the Array:- ");   
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The Minimum element of the Array:- "+ firstSmallestElement(arr));
    }
}