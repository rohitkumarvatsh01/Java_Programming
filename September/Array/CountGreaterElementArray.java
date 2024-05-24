import java.util.Scanner;
public class CountGreaterElementArray{

    public static int countElement(int[] arr, int x){
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

        System.out.println("Enter the Element in Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Key:- ");
        int key=sc.nextInt();

        int ans=countElement(arr, key);
        System.out.println("Count Greater Element in Array:- "+ans);
    }
}