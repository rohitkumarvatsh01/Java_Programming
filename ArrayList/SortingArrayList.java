import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args){
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(1);
        ans.add(5);
        ans.add(2);
        ans.add(4);
        ans.add(3);
        System.out.println(ans);
        

        //Ascending Order
        Collections.sort(ans);
        System.out.println(ans);
        
        //Descending Order
        Collections.sort(ans, Collections.reverseOrder());
        System.out.println(ans);
    }
}
