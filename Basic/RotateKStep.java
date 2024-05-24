import java.util.Scanner;
public class RotateKStep{

    static void printArray(int[] arr){
        System.out.println("The Rotate kth Steps Array:- ");
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] rotateKstep(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        int[] ans=new int[n];
        int j=0;

        for(int i=n-k; i<n; i++){
            ans[j++]=arr[j];
        }

        for(int i=0; i<n-k; i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Kth Steps:- ");
        int k=sc.nextInt();

        int[] ans=rotateKstep(arr, k);
        printArray(ans);

    }
}