import java.util.Scanner;
public class SearchElement{

    public static int searchElement(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter the Key Element:- ");
        int key=sc.nextInt();

        int ans=searchElement(arr, key);
        System.out.println("Element Present or not:- "+ans);
        
    }
}