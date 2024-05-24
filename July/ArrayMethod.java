import java.util.Arrays;
import java.util.Scanner;
public class ArrayMethod {

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array1:- ");
        int n=sc.nextInt();
        System.out.println("Enter the Element of Array1:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Size of Array2:- ");
        int m=sc.nextInt();
        System.out.println("Enter the Element of Array2:- ");
        int[] brr=new int[n];
        for(int i=0; i<m; i++){
            brr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        printArray(arr);

        Arrays.sort(brr);
        printArray(brr);

        boolean ans=Arrays.equals(arr, brr);
        System.out.println("Equals Array1 and Array2:- "+ans);

        int[] crr=Arrays.copyOf(arr, arr.length);
        printArray(crr);
        
    }
}
