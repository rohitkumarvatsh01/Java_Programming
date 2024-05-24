import java.util.Scanner;
public class UniqueElementArray {

    public static int uniqueElement(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element of Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Unique Element in Array:- "+uniqueElement(arr));
    }
}
