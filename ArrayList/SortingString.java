import java.util.*;
public class SortingString {

    public static void main(String[] args){
        ArrayList<String>ans=new ArrayList<>();
        ans.add("Rohit");
        ans.add("Kumar");
        ans.add("Singh");
        ans.add("Delhi");
        System.out.println(ans);

        Collections.sort(ans);
        System.out.println(ans);

        Collections.sort(ans, Collections.reverseOrder());
        System.out.println(ans);
    }
}