import java.util.Scanner;
public class SecondSmallestNumber {
    
    public static int firstSmallest(int[] arr){

        int min=Integer.MAX_VALUE;
        int n=arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static int secondSmallest(int[] arr){

        int min=firstSmallest(arr);
        int n=arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]==min){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int secondMin=firstSmallest(arr);
        return secondMin;
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

        int min1=firstSmallest(arr);
        int min2=secondSmallest(arr);

        System.out.println("First Smallest Element:- "+min1);
        System.out.println("Second Smallest Element:- "+min2);
    }
}
