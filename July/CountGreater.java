import java.util.Scanner;
public class CountGreater{

    public static int countGreater(int[] arr, int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
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

        int ans=countGreater(arr, x);
        System.out.println("Count of greater Element x in Array:- "+ans);
    }
}