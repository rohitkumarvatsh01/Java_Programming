import java.util.Scanner;
public class CopyElementArray{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element in Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();

        //Copy Element in new Array
        int[] brr=new int[n];
        for(int i=0; i<n; i++){
            brr[i]=arr[i];
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}