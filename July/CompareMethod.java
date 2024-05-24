import java.util.*;
public class CompareMethod{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array1:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element of Array1:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Size of Array2:- ");
        int m=sc.nextInt();

        System.out.println("Enter the Element of Array2:- ");
        int[] brr=new int[n];
        for(int i=0; i<n; i++){
            brr[i]=sc.nextInt();
        }
        
        if(arr==brr){
            System.out.println("Array1 is equal to Array2");
        }
        else{
            System.out.println("Array1 is not equal to Array2");
        }

        if(Arrays.equals(arr, brr)){
            System.out.println("Array1 is equal to Array2");
        }
        else{
            System.out.println("Array1 is equal to Array2");
        }
    }
}
