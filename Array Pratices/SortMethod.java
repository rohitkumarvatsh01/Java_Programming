import java.util.Scanner;
import java.util.Arrays;
public class SortMethod {

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sortArray(int[] arr){
        Arrays.sort(arr);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array:- ");
        int n1=sc.nextInt();
        int[] arr=new int[n1];
        for(int i=0; i<n1; i++){
            arr[i]=sc.nextInt();
        }

        sortArray(arr);
        printArray(arr);
    }
}
