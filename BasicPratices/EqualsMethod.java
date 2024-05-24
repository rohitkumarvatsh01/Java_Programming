import java.util.Scanner;
import java.util.Arrays;
public class EqualsMethod{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array1:- ");
        int n1=sc.nextInt();

        System.out.println("Enter the element of Array1:- ");
        int[] arr1=new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the Size of Array2:- ");
        int n2=sc.nextInt();

        System.out.println("Enter the element of Array2:- ");
        int[] arr2=new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i]=sc.nextInt();
        }

        boolean ans=Arrays.equals(arr1, arr2);
        System.out.println("Array1 and Array2 is Equal or not:- "+ans);
    } 
}