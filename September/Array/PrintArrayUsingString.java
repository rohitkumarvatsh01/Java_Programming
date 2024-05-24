import java.util.Arrays;
public class PrintArrayUsingString {
    public static void main(String[] args){
        String[] arr={"Rohit", "Kumar", "Singh"};
        System.out.print(Arrays.toString(arr));
        
        System.out.println();

        System.out.print(Arrays.asList(arr));

        System.out.println();

        int[][] brr={{10,20,30},{40,50,60}};
        System.out.print(Arrays.deepToString(brr));
    }
}
