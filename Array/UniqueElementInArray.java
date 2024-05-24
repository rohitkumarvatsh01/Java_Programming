import java.util.Scanner;
public class UniqueElementInArray{
    public static int findUnique(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
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

        int ans=findUnique(arr);
        System.out.println("The Unique Number in the Array:- "+ans);
    }
}