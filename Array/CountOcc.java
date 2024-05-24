import java.util.Scanner;
public class CountOcc{

    public static int countOcc(int[] arr, int n, int x){
        int count=0;

        for(int i=0; i<n; i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
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

        System.out.println("Enter the value of Occurance:- ");
        int x=sc.nextInt();

        int ans=countOcc(arr, n, x);
        System.out.println("The Occurance of x:- "+ans);

    }
}