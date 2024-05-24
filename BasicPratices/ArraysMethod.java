import java.util.Arrays;
public class ArraysMethod{
    public static void main(String[] args){
        String a[]={"Rohit", "Kumar", "Singh"};
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.asList(a));

        int[][] arr={ {10, 20}, {30, 40}};
        System.out.println(Arrays.deepToString(arr));
    }
}