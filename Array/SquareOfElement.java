import java.util.Scanner;

public class SquareOfElement {

   

    static void reverse(int[] arr){
        int n=arr.length;

        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] sortSquare(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int[] ans=new int[n];
        int j=0;

        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[j++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[j++]=arr[right]*arr[right];
                right--;
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

        int[] ans=sortSquare(arr);
        reverse(ans);
    }
}
