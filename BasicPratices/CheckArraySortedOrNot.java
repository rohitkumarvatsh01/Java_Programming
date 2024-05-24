import java.util.Scanner;
public class CheckArraySortedOrNot{

    public static boolean checkSortedArray(int[] arr){
    
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean check(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[i]>arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sorted(int[] arr){
        boolean check=true;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                check=false;
                break;
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

        boolean ans=checkSortedArray(arr);
        System.out.println("Array Sorted or Not:- "+ans);

        System.out.println(check(arr));

        System.out.println(sorted(arr));
    }
}