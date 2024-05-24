public class Array{

    void Arrays(){
        int arr[]=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
    public static void main(String[] args){
        Array obj = new Array();
        obj.Arrays();
    }
}