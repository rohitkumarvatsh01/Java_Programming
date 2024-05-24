public class StaticArray{
    public static void main(String[] args){
        int[] arr=new int[3];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}