import java.util.Scanner;
public class OccuranceCount{

    public static int occuranceCount(int[] arr, int key){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                count++;
            }
        }
        return count;
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

        System.out.println("Enter the Key Element:- ");
        int key=sc.nextInt();

        int ans=occuranceCount(arr, key);
        System.out.println("Occurance Count is:- "+ans);
    }
}