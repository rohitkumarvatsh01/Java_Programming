import java.util.Scanner;
public class ArraySortedOrNot{

    public static boolean sortedArray(int[] arr){
        boolean check=true;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[i]>arr[j]){
                    check=false;
                    break;
                }
            }
        }
        return check;
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

        boolean ans=sortedArray(arr);
        System.out.println("Array is Sorted or Not:- "+ans);
    }
}