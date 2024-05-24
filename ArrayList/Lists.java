import java.util.*;
  
public class Lists {
    public static void main(String[] args){
        List<Integer>ans=new ArrayList<>();

        ans.add(0);
        ans.add(1);
        ans.add(3);
        ans.add(2);  
        System.out.println(ans);

        int size=ans.size();
        System.out.println("Size of List:- "+size);

        ans.remove(3);
        System.out.println(ans);
        
        ans.clear();
        System.out.println(ans);

        ans.addAll(5, 1);
        System.out.println(ans);
    }
}
