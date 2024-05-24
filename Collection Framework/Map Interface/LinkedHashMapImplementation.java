import java.util.*;
public class LinkedHashMapImplementation {
    public static void main(String[] args){
        Map<Integer, String>ans=new LinkedHashMap<>();

        ans.put(1,"Rohit");
        ans.put(3,"Aman");
        ans.put(2,"Kajal");

        System.out.println(ans);
    }
}
