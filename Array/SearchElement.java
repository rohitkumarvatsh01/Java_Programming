import java.util.Scanner;

public class SearchElement{

    static int searchIndex(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                System.out.println("The Search element is Present in the array index:- " + i);
                break;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of the Array");
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value which you want to Search:- ");
        int x=sc.nextInt();

        searchIndex(arr, x);

    }
}