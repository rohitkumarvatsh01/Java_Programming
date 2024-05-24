import java.util.Collections;
import java.util.ArrayList;
public class ReverseArrayListUsingCollectionMethod {
    public static void main(String[] args) {
        
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);
        ans.add(5);

        System.out.println(ans);

        Collections.reverse(ans);
        System.out.println(ans);
    }
}
