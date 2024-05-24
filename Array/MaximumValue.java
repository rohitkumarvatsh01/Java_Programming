import java.util.Scanner;

public class MaximumValue{

    static void maxElement(int [] arr){
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The MAximum Value is:- "+ max);
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element of the Array- ");
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        maxElement(arr);

    }
}