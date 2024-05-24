import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListString {
    public static void main(String[] args){
        ArrayList<String>list=new ArrayList<String>();

        list.add("Rohit");
        list.add("Kumar");
        list.add("Singh");

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
