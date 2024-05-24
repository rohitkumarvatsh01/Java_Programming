import java.util.Scanner;

public class ArraySum{

    static void ArraySum(int [] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("The Sum of the Array:- "+sum);  
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of the Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element of the Array:- ");
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        ArraySum(arr);

    }
}