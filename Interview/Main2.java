import java.util.*;
import java.util.Scanner;
public class Main2
{
	
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // total number of items
            int k = scanner.nextInt(); // maximum distinct prices to remember
            int x = scanner.nextInt(); // cost of each price not remembered

            Set<Integer> prices = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int price = scanner.nextInt();
                prices.add(price);
            }

            int distinctPrices = prices.size();
            int cost = 0;

            if (distinctPrices > k) {
                int extraPrices = distinctPrices - k;
                cost = extraPrices * x;
            }

            System.out.println(cost);
        }
    }

}