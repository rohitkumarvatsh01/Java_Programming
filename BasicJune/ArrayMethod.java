import java.util.Scanner;
import java.util.Arrays;
public class ArrayMethod {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        //Sort Method
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        //Equals Method
        int[] brr={1,2,3,4,5};
        boolean ans=Arrays.equals(arr, brr);
        System.out.println(ans);
        

        //Copy Method
        int[] crr=Arrays.copyOf(arr, arr.length);
        for(int i=0; i<crr.length; i++){
            System.out.print(crr[i]+" ");
        }

    }
}
