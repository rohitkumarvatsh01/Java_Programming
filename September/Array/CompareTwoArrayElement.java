import java.util.Scanner;
import java.util.Arrays;

public class CompareTwoArrayElement {

    public static void equalOperator(int[] arr, int[] brr){
        if(brr==brr){
            System.out.println("Array1 and Array2 is Equal");
        }
        else{
            System.out.println("Array1 and Array2 is Not Equal");
        }
    }

    public static void equalMethod(int[] arr, int[] brr){
        if(Arrays.equals(arr, brr)){
            System.out.println("Array1 and Array2 is Equal");
        }
        else{
            System.out.println("Array1 and Array2 is Not Equal");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array1:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element in Array1:- ");
        int[] arr1=new int[n];
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the Size of Array2:- ");
        int m=sc.nextInt();

        System.out.println("Enter the Element in Array2:- ");
        int[] arr2=new int[m];
        for(int i=0; i<m; i++){
            arr2[i]=sc.nextInt();
        }

        equalOperator(arr1, arr2);
        equalMethod(arr1, arr2);
    }
}
