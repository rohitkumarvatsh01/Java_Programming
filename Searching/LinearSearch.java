import java.util.Scanner;

public class LinearSearch{

    static int linearSearch(int[] arr, int n, int key){
        for(int i=0; i<n; i++){
            if(arr[i]==key){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element of Array:- ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value of Key:- ");
        int key=sc.nextInt();

        System.out.println("Linear Search:- "+linearSearch(arr, n, key));

    }
}