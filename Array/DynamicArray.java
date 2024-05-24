import java.util.Scanner;
public class DynamicArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The Array elemnt output:- ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}