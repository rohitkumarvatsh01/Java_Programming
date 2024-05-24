import java.util.Scanner;
public class Sort01Count {

    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void sort01(int[] arr){
        int n=arr.length;
        int zeros=0;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                zeros++;
            }
        }

        for(int i=0; i<n; i++){
            if(i<zeros){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        sort01(arr);
        printArray(arr);
    }
}
