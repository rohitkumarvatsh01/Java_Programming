import java.util.Scanner;

public class TripletSum{
    static int tripletSum(int[] arr, int target){
        int n=arr.length;
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element of the Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Sum value target:- ");
        int target=sc.nextInt();

        System.out.println("The Count of Triplet Sum:- "+ tripletSum(arr, target));

    }
}