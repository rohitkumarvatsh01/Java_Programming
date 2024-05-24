import java.util.Scanner;
import java.util.HashMap;

public class Count_pairs_with_given_sum {

    public static int countSum(int[] arr, int k){
        int count=0;
    
        HashMap<Integer, Integer>ans=new HashMap<>();
    
        for(int i=0; i<arr.length; i++){
            int diff=k-arr[i];
    
            if(ans.containsKey(diff)){
                count+=ans.get(arr[i]);
            }
    
            if(ans.containsKey(arr[i])){
                ans.put(arr[i], ans.get(arr[i])+1);
            }
            else{
                ans.put(arr[i], 1);
            }
        }
    
        return count;
    
    }

    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the Element in Array:- ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Sum:- ");
        int k=sc.nextInt();

        int ans=countSum(arr, k);
        System.out.println(ans);
    }
}
