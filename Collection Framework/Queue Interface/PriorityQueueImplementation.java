import java.util.*;
public class PriorityQueueImplementation{
    public static void main(String[] args){

        System.out.println("Minimum Priority Queue:- ");

        PriorityQueue<Integer>ans=new PriorityQueue<>();

        ans.add(10);
        ans.add(5);
        ans.add(7);

        System.out.println(ans.peek());
        System.out.println(ans);
        System.out.println(ans.poll());
        System.out.println(ans);
        System.out.println(ans.isEmpty());
        System.out.println(ans.size());


        System.out.println("Maximum Priority Queue:- ");

        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(10);
        pq.add(5);
        pq.add(7);

        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.isEmpty());
        System.out.println(pq.size());
    }
}