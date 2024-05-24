import java.util.Scanner;

public class SecondLargestElement {
    static int firstLargestElement(int[] arr){

        int max=Integer.MIN_VALUE;
        int n=arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int secondLargestElement(int[] arr){

        int n=arr.length;
        int max=firstLargestElement(arr);

        for(int i=0; i<n; i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;;
            }
        }
        int secondMax=firstLargestElement((arr));
        return secondMax;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The Second Maximum Element is:- "+ secondLargestElement(arr));
    }
}
