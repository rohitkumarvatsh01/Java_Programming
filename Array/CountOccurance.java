import java.util.Scanner;

public class CountOccurance{
    static void countOcc(int[] arr, int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println("The Count of Occurance is:- "+ count);
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of the Array:- ");
        int n=sc.nextInt();

        System.out.println("Enter the element in Array:- ");
        int[] arr=new int [n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value of Occurence:- ");
        int x=sc.nextInt();

        countOcc(arr, x);

    }
}