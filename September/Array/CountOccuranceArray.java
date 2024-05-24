import java.util.Scanner;
public class CountOccuranceArray{

    public static int countOccurance(int[] arr, int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
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

        System.out.println("Enter the Occurance Number:- ");
        int x=sc.nextInt();

        int ans=countOccurance(arr, x);
        System.out.println("Count of Occurance is:- "+ans);
    }
}