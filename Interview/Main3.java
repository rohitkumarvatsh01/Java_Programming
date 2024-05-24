import java.util.Scanner;
import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // sort the array to minimize the difference between the two new arrays
        int[] arr1 = new int[n/2];
        int[] arr2 = new int[n/2];
        int index = 0;
        for (int i = 0; i < n/2; i++) {
            arr1[i] = arr[index++];
            arr2[i] = arr[index++];
        }
        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();
        int diff = Math.abs(sum1 - sum2);
        System.out.println(diff);
    }
}
