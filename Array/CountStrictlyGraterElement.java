import java.util.Scanner;
public class CountStrictlyGraterElement {

    public static int countGreaterElement(int[] arr, int x){

        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=x){
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

        System.out.println("Enter the value of X:- ");
        int x=sc.nextInt();

        int ans=countGreaterElement(arr, x);
        System.out.println("The count of Greater number is:- "+ans);
    }
}
