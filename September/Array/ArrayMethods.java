import java.util.*;
public class ArrayMethods {

    public static void sortMethod(int[] arr){
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void equalsMethod(int[] arr, int[] brr){
        if(Arrays.equals(arr, brr)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }
    }

    public static void copyArray(int[] arr){
        int[] crr=new int[arr.length];
        Arrays.copyOf(arr, arr.length);

        for(int i=0; i<arr.length; i++){
            System.out.print(crr[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array1:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element in Array1:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Size of Array2:- ");
        int m=sc.nextInt();

        System.out.println("Enter the Element in Array2:- ");
        int[] brr=new int[n];
        for(int i=0; i<n; i++){
            brr[i]=sc.nextInt();
        }

        sortMethod(arr);
        equalsMethod(arr, brr);
    }
}
