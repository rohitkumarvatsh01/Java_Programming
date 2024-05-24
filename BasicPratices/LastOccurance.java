import java.util.Scanner;
public class LastOccurance{

    public static int lastOccurance(int[] arr, int key){
        int index=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                index=i;
            }
        }
        return index;
    }

    public static int lastOcc(int[] arr, int key){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
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

        System.out.println("Enter the Key Element:- ");
        int key=sc.nextInt();

        System.out.println("Last Occurance in Array:- "+lastOccurance(arr, key));
        System.out.println("Last Occurance in Array:- "+lastOcc(arr, key));
    }
}