import java.util.Scanner;

public class InsertElementArray {
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter the Size of Array:- ");
      int size=sc.nextInt();

      System.out.println("Enter the Element in Array:- ");
      int[] arr=new int[size+1];
      for(int i=0; i<size; i++){
         arr[i]=sc.nextInt();
      }

      System.out.println("Enter the Location of Array which one is Insert in Array:- ");
      int loc=sc.nextInt();

      System.out.println("Enter the Element of Array which one is Insert in Array:- ");
      int item=sc.nextInt();

      for(int i=size; i>loc; i--){
         arr[i]=arr[i-1];
      }

      arr[loc]=item;
      size++;

      for(int i=0; i<size; i++){
         System.out.print(arr[i]+" ");
      }
   }
}
