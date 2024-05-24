import java.util.Scanner;

public class MinElement {

    static int minElement(int[] arr){
        int n=arr.length;
        int min=Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
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

        System.out.println("The Minimum Element in the Array:- "+ minElemenrt(arr));
    }
}
