import java.util.Scanner;
public class RotateKStepsInArray {

    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] rotateKSteps(int[] arr, int k){
        int n=arr.length;
        int[] ans=new int[n];
        k=k%n;
        int j=0;

        for(int i=n-k; i<n; i++){
            ans[j++]=arr[i];
        }

        for(int i=0; i<n-k; i++){
            ans[j++]=arr[i];
        }

        return ans;
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

        System.out.println("Enter the value of K steps:- ");
        int k=sc.nextInt();

        int[] ans=rotateKSteps(arr, k);
    
        printArray(ans);
    }
}
