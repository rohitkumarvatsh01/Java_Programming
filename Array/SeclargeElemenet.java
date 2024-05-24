import java.util.Scanner;
public class SeclargeElemenet {

    static int firstMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
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

        System.out.println("The Maximum Element in Array:- "+firstMax(arr));
    }
}
