import java.util.Scanner;

public class LastIndexOccurance{
    static void lastIndexOcc(int[] arr, int x){
        int index=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                index=i;
            }
        }
        System.out.println("The Index of Last Occurance:- "+ index);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array:- ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element in Array:- ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value of Occurance:- ");
        int x=sc.nextInt();

        lastIndexOcc(arr, x);
    }
}