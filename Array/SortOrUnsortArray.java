import java.util.Scanner;
public class SortOrUnsortArray {

    public static boolean isSort(int[] arr){

        boolean check=true;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    check=false;
                    break;
                }
            }
        }
        return check;
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

        boolean ans=isSort(arr);
        System.out.println("Sort or Unsorted:- "+ans);
    }
}
