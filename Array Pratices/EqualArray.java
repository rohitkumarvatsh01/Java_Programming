import java.util.Arrays;
import java.util.Scanner;
public class EqualArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array1:- ");
        int n1=sc.nextInt();
        int[] arr=new int[n1];
        for(int i=0; i<n1; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Array2:- ");
        int n2=sc.nextInt();
        int[] brr=new int[n2];
        for(int i=0; i<n2; i++){
            brr[i]=sc.nextInt();
        }

        //Equal method
        boolean ans=Arrays.equals(arr, brr);
        if(ans==true){
            System.out.println("Array1 and Array2 is Equal");
        }
        else{
            System.out.println("Array1 and Array2 is Not Equal");
        }

        //Equal Operater
        if(arr==brr){
            System.out.println("Array1 and Array2 is Equal");
        }
        else{
            System.out.println("Array1 and Array2 is Not Equal");
        }
    }
}