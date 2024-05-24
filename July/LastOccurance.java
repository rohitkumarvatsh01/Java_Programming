import java.util.Scanner;
public class LastOccurance{

    public static int lastOccurance(int[] arr, int x){
        int lastIndex=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                lastIndex=i;
            }
        }
        return lastIndex;
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

        System.out.println("Enter the Occurance:- ");
        int x=sc.nextInt();

        int ans=lastOccurance(arr, x);
        System.out.println("Last Occurance in Array:- "+ans);
    }
}