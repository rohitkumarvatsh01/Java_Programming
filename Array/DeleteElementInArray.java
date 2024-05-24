import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the locatin of element delete:- ");
        int loc=sc.nextInt();

        for(int i=loc; i<n-1; i++){
            arr[i]=arr[i+1];
        }
        n--;

        System.out.println("The Array element Output:- ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
