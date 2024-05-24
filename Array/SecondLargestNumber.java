import java.util.Scanner;
public class SecondLargestNumber {

    public static int firstLargest(int[] arr){
        
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int secondLargest(int[] arr){
        int max=firstLargest(arr);
        int n=arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        int secondMax=firstLargest(arr);
        return secondMax;
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

        int max1=firstLargest(arr);
        int max2=secondLargest(arr);

        System.out.println("First Largest Element Array:- "+max1);
        System.out.println("Second Largset Element Array:- "+max2);
    }
}
