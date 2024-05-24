import java.util.Scanner;
public class LinearSearch{

    pu blic static int linearSearch(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:-");
        int n=sc.nextInt();

        System.out.println("Enter the Element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Search Element:- ");
        int x=sc.nextInt();

        System.out.println(linearSearch(arr, x));
    }
}