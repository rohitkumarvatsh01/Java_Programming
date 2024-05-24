import java.util.*;
public class LinkedListFramework {
    public static void main(String[] args){
        LinkedList<String>list=new LinkedList<String>();

        list.add("is");
        list.add("a");
        list.add("list");
        list.add("this");

        System.out.println(list);
        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i)+"->");
        }

        System.out.println(list.get(0));

        list.remove(3);
        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }
}
