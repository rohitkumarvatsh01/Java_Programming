import java.util.Scanner;
public class LastIndexOcc{

    public static int lastOcc(int[] arr, int n, int x){
        
        int lastIndex=-1;
        for(int i=0; i<n; i++){
            if(arr[i]==x){
                lastIndex=i;
            }
        }
        return lastIndex;
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

        System.out.println("Enter the value of last Occurance:- ");
        int x=sc.nextInt();

        int ans=lastOcc(arr, n, x);
        System.out.println("The last Index is:- "+ans);
    }
}