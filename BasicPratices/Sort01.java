import java.util.Scanner;
public class Sort01{

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort01(int[] arr){
        int zeroCount=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zeroCount++;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(i<zeroCount){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        sort01(arr);
        printArray(arr);
    }
}
