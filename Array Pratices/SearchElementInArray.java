import java.util.Scanner;

public class SearchElementInArray{

    //Search Function
    public static int searchElementInArray(int[] arr, int key){
        int n=arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]==key){
                return 1;
            }
        }
        return -1;
    }

    //Main Function
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the search element:- ");
        int key=sc.nextInt();

        //Function calling
        int ans=searchElementInArray(arr, key);
        System.out.println("Element Present or Not:- "+ ans);

    }
}