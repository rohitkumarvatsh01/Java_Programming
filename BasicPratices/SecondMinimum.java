import java.util.Scanner;
public class SecondMinimum{

    public static int firstSmall(int[] arr){
        int small=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        return small;
    }
    
    public static int secondSmall(int[] arr){
        int sm=firstSmall(arr);
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==sm){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        
        int second=firstSmall(arr);
        return second;
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

        System.out.println("First Smallest Element:- "+firstSmall(arr));
        System.out.println("Second Smallest Element:- "+secondSmall(arr));
    } 
}