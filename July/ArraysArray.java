import java.util.Arrays;
public class ArraysArray {
    public static void main(String[] args){
        String a[]={"Rohit", "Kumar", "Singh"};
        System.out.print(Arrays.toString(a));
        
        System.out.println();

        System.out.print(Arrays.asList(a));
        System.out.println();

        int arr[][]={{10,20},{30,40}};
        System.out.print(Arrays.deepToString(arr));
    }
}
