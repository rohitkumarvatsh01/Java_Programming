import java.util.Scanner;
public class SecLargestElement1{
    
    //First Maximum Element
    static int firstMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int n=arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    //Second Maximum
    static int secondMax(int[] arr){
        int n=arr.length;
        int max=firstMax(arr);

        for(int i=0; i<n; i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        int secMax=firstMax(arr);
        return secMax;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element of Array;- ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("The First Maximum element in Array:- "+ firstMax(arr));
        System.out.println("The Second Maximum element in Array:- "+ secondMax(arr));
    }
}                