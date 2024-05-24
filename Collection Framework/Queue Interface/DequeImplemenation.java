import java.util.*;
public class DequeImplemenation {
    public static void main(String[] args){
        Deque<Integer>ans=new ArrayDeque<>();

        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);
        ans.add(5);

        System.out.println(ans);
        System.out.println(ans.pollFirst());
        System.out.println(ans.pollLast());
        System.out.println(ans);
        System.out.println(ans.isEmpty());
        System.out.println(ans.size());
    }
}
