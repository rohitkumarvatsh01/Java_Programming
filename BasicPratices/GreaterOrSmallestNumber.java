import java.util.Scanner;
public class GreaterOrSmallestNumber{

    public static int greaterElement(int[] arr, int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }

    public static int smallestElement(int[] arr, int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size o f Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element in Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the key Element:- ");
        int key=sc.nextInt();

        System.out.println("Count of Greatest Element:- "+greaterElement(arr, key));
        System.out.println("Count of Smallest Element:- "+smallestElement(arr, key));
    }
}