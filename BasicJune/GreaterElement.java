import java.util.Scanner;
public class GreaterElement{

    public static int countGreatestElement(int[] arr, int x){
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

        System.out.println("Enter the Number:- ");
        int x=sc.nextInt();

        int ans=countGreatestElement(arr, x);
        System.out.println("Count of Greater Element:- "+ans);
    }
}