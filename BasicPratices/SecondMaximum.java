import java.util.Scanner;
public class SecondMaximum{

    public static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int findSecondMax(int[] arr){
        int max=findMax(arr);
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        int secondMax=findMax(arr);
        return secondMax;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Szie of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element in Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Largest Element in Array:- "+findMax(arr));
        System.out.println("Second Largest Element in Array:- "+findSecondMax(arr));
    }
}