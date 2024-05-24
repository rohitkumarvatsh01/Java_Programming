import java.util.Scanner;
public class SmallestElementArray{

    public static int smallestElement(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element in Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Smallest Element in Array:- "+smallestElement(arr));
    }
}
