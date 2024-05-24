import java.util.Scanner;

public class ArrayInputOutput{

    static void ArrayPrint(int [] arr){
        System.out.println("The Output of the Array");
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the Array:- ");
        int n=sc.nextInt();

        int [] arr=new int[n];

        System.out.println("Enter the Element of the Array:- ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        ArrayPrint(arr);
    }

}
