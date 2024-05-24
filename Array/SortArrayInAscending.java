import java.util.Scanner;
public class SortArrayInAscending {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
