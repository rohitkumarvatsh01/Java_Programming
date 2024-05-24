import java.util.Scanner;
public class SecondMaximumElementArray {

    public static int firstMaximum(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int secondMaximum(int[] arr){
        int max=firstMaximum(arr);

        for(int i=0; i<arr.length; i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        int second=firstMaximum(arr);
        return second;
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

        System.out.println("Unique Element in Array:- "+secondMaximum(arr));
    }
}
