import java.util.Scanner;

public class MinimumValue{
    static void minValue(int [] arr){
        int mini=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<mini){
                mini=arr[i];
            }
        }
        System.out.println("The MiniMum value in this Array:- "+ mini);

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of the Array:-");
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        minValue(arr);
    }
}