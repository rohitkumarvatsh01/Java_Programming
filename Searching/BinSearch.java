import java.util.Scanner;
public class BinSearch {

    public static int binarySearch(int[] arr, int n, int key){
        int left=0;
        int right=n-1;
        int mid=(left+right)/2;

        while(left<=right){
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<right){
                mid=left++;
            }
            else{
                right--;
            }

            mid=(left+right)/2;
        }

        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size:- ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the key:- ");
        int key=sc.nextInt();

        int ans=binarySearch(arr, n, key);
        System.out.println(ans);

    }
}
