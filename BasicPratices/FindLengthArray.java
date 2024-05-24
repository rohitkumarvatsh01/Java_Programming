import java.util.Scanner;
public class FindLengthArray{

    public static void lengthArray(int[] arr){
        System.out.println("Length of Array:- "+arr.length);
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

        lengthArray(arr);
    }
}