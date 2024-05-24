import java.util.Collections;
import java.util.ArrayList;
public class SortArrayList {
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();

        list.add(11);
        list.add(2);
        list.add(6);
        list.add(4);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
