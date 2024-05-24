import java.util.Scanner;
public class TargetSumTwo{

    static int targetSumTwo(int[] arr, int target){
        int n=arr.length;
        int count=0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array:- ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element of Array:- ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target Value:- ");
        int target=sc.nextInt();
        
        System.out.println("Count of Target:- " + targetSumTwo(arr, target));
    }
}