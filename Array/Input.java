import java.util.Scanner;
public class Input{

    static void arrayPrint(int[] arr){
        System.out.println("The Element of the Array:- ");

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of the Array:- ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the Element in Array:- ");
        
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        arrayPrint(arr);



    }
}