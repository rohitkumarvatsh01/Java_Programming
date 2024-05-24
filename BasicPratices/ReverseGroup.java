import java.util.Scanner;
public class ReverseGroup {

    public static void reverseGroup(int[] arr, int k){
        int n=arr.length;

        for(int i=0; i<n; i++){
            int start=i;
            int end=Math.min(i+k-1, n-1);

            while(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;

                start++;
                end--;
            }
        }
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

        System.out.println("Enter the Value of K:- ");
        int k=sc.nextInt();

        reverseGroup(arr, k);
    }
}
