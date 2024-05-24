import java.util.Scanner;
public class SmallestLargestElement{

    public static int[] smallestLargestElement(int[] arr){
        int smallElement=0;
        int largeElement=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallElement){
                smallElement=arr[i];
            }
            else{
                largeElement=arr[i];
            }
        }

        int[] ans=new int[2];
        ans[0]=smallElement;
        ans[1]=largeElement;

        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int[] ans=smallestLargestElement(arr);
        System.out.println(ans);
    } 
}