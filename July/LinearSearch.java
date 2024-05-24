import java.util.Scanner;
public class LinearSearch {

    public static int linearSearch(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element in Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Search Key:- ");;
        int key=sc.nextInt();

        System.out.println(linearSearch(arr, n));
    }
}