import java.util.Scanner;
public class DeleteElementArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element in Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter the Location of Array:- ");
        int delete=sc.nextInt();

        for(int i=delete; i<n-1; i++){
            arr[i]=arr[i+1];
        }
        n--;

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
