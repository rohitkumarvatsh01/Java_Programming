import java.util.Scanner;
public class SearchElementInArray{

    public static boolean searchElement(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
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

        System.out.println("Enter the Key Element in Array:- ");
        int key=sc.nextInt();

        boolean ans=searchElement(arr, key);
        System.out.println("Element Present or Not:- "+ans);
    }
}